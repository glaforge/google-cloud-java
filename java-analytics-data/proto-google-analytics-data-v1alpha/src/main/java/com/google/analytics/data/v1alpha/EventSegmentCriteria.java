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
// source: google/analytics/data/v1alpha/data.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.data.v1alpha;

/**
 *
 *
 * <pre>
 * An event matches a criteria if the event meet the conditions in the
 * criteria.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.EventSegmentCriteria}
 */
public final class EventSegmentCriteria extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.EventSegmentCriteria)
    EventSegmentCriteriaOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EventSegmentCriteria.newBuilder() to construct.
  private EventSegmentCriteria(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EventSegmentCriteria() {
    andConditionGroups_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EventSegmentCriteria();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_EventSegmentCriteria_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_EventSegmentCriteria_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.EventSegmentCriteria.class,
            com.google.analytics.data.v1alpha.EventSegmentCriteria.Builder.class);
  }

  public static final int AND_CONDITION_GROUPS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.analytics.data.v1alpha.EventSegmentConditionGroup>
      andConditionGroups_;
  /**
   *
   *
   * <pre>
   * An event matches this criteria if the event matches each of these
   * `andConditionGroups`.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.data.v1alpha.EventSegmentConditionGroup>
      getAndConditionGroupsList() {
    return andConditionGroups_;
  }
  /**
   *
   *
   * <pre>
   * An event matches this criteria if the event matches each of these
   * `andConditionGroups`.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.analytics.data.v1alpha.EventSegmentConditionGroupOrBuilder>
      getAndConditionGroupsOrBuilderList() {
    return andConditionGroups_;
  }
  /**
   *
   *
   * <pre>
   * An event matches this criteria if the event matches each of these
   * `andConditionGroups`.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
   * </code>
   */
  @java.lang.Override
  public int getAndConditionGroupsCount() {
    return andConditionGroups_.size();
  }
  /**
   *
   *
   * <pre>
   * An event matches this criteria if the event matches each of these
   * `andConditionGroups`.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.EventSegmentConditionGroup getAndConditionGroups(
      int index) {
    return andConditionGroups_.get(index);
  }
  /**
   *
   *
   * <pre>
   * An event matches this criteria if the event matches each of these
   * `andConditionGroups`.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.EventSegmentConditionGroupOrBuilder
      getAndConditionGroupsOrBuilder(int index) {
    return andConditionGroups_.get(index);
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
    for (int i = 0; i < andConditionGroups_.size(); i++) {
      output.writeMessage(1, andConditionGroups_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < andConditionGroups_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, andConditionGroups_.get(i));
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.EventSegmentCriteria)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.EventSegmentCriteria other =
        (com.google.analytics.data.v1alpha.EventSegmentCriteria) obj;

    if (!getAndConditionGroupsList().equals(other.getAndConditionGroupsList())) return false;
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
    if (getAndConditionGroupsCount() > 0) {
      hash = (37 * hash) + AND_CONDITION_GROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getAndConditionGroupsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.EventSegmentCriteria parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentCriteria parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentCriteria parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentCriteria parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentCriteria parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentCriteria parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentCriteria parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentCriteria parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentCriteria parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentCriteria parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentCriteria parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.EventSegmentCriteria parseFrom(
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
      com.google.analytics.data.v1alpha.EventSegmentCriteria prototype) {
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
   * An event matches a criteria if the event meet the conditions in the
   * criteria.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.EventSegmentCriteria}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.EventSegmentCriteria)
      com.google.analytics.data.v1alpha.EventSegmentCriteriaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_EventSegmentCriteria_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_EventSegmentCriteria_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.EventSegmentCriteria.class,
              com.google.analytics.data.v1alpha.EventSegmentCriteria.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.EventSegmentCriteria.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (andConditionGroupsBuilder_ == null) {
        andConditionGroups_ = java.util.Collections.emptyList();
      } else {
        andConditionGroups_ = null;
        andConditionGroupsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_EventSegmentCriteria_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.EventSegmentCriteria getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.EventSegmentCriteria.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.EventSegmentCriteria build() {
      com.google.analytics.data.v1alpha.EventSegmentCriteria result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.EventSegmentCriteria buildPartial() {
      com.google.analytics.data.v1alpha.EventSegmentCriteria result =
          new com.google.analytics.data.v1alpha.EventSegmentCriteria(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.analytics.data.v1alpha.EventSegmentCriteria result) {
      if (andConditionGroupsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          andConditionGroups_ = java.util.Collections.unmodifiableList(andConditionGroups_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.andConditionGroups_ = andConditionGroups_;
      } else {
        result.andConditionGroups_ = andConditionGroupsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.analytics.data.v1alpha.EventSegmentCriteria result) {
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
      if (other instanceof com.google.analytics.data.v1alpha.EventSegmentCriteria) {
        return mergeFrom((com.google.analytics.data.v1alpha.EventSegmentCriteria) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.EventSegmentCriteria other) {
      if (other == com.google.analytics.data.v1alpha.EventSegmentCriteria.getDefaultInstance())
        return this;
      if (andConditionGroupsBuilder_ == null) {
        if (!other.andConditionGroups_.isEmpty()) {
          if (andConditionGroups_.isEmpty()) {
            andConditionGroups_ = other.andConditionGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAndConditionGroupsIsMutable();
            andConditionGroups_.addAll(other.andConditionGroups_);
          }
          onChanged();
        }
      } else {
        if (!other.andConditionGroups_.isEmpty()) {
          if (andConditionGroupsBuilder_.isEmpty()) {
            andConditionGroupsBuilder_.dispose();
            andConditionGroupsBuilder_ = null;
            andConditionGroups_ = other.andConditionGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
            andConditionGroupsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAndConditionGroupsFieldBuilder()
                    : null;
          } else {
            andConditionGroupsBuilder_.addAllMessages(other.andConditionGroups_);
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
                com.google.analytics.data.v1alpha.EventSegmentConditionGroup m =
                    input.readMessage(
                        com.google.analytics.data.v1alpha.EventSegmentConditionGroup.parser(),
                        extensionRegistry);
                if (andConditionGroupsBuilder_ == null) {
                  ensureAndConditionGroupsIsMutable();
                  andConditionGroups_.add(m);
                } else {
                  andConditionGroupsBuilder_.addMessage(m);
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

    private java.util.List<com.google.analytics.data.v1alpha.EventSegmentConditionGroup>
        andConditionGroups_ = java.util.Collections.emptyList();

    private void ensureAndConditionGroupsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        andConditionGroups_ =
            new java.util.ArrayList<com.google.analytics.data.v1alpha.EventSegmentConditionGroup>(
                andConditionGroups_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.EventSegmentConditionGroup,
            com.google.analytics.data.v1alpha.EventSegmentConditionGroup.Builder,
            com.google.analytics.data.v1alpha.EventSegmentConditionGroupOrBuilder>
        andConditionGroupsBuilder_;

    /**
     *
     *
     * <pre>
     * An event matches this criteria if the event matches each of these
     * `andConditionGroups`.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
     * </code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.EventSegmentConditionGroup>
        getAndConditionGroupsList() {
      if (andConditionGroupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(andConditionGroups_);
      } else {
        return andConditionGroupsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * An event matches this criteria if the event matches each of these
     * `andConditionGroups`.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
     * </code>
     */
    public int getAndConditionGroupsCount() {
      if (andConditionGroupsBuilder_ == null) {
        return andConditionGroups_.size();
      } else {
        return andConditionGroupsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * An event matches this criteria if the event matches each of these
     * `andConditionGroups`.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
     * </code>
     */
    public com.google.analytics.data.v1alpha.EventSegmentConditionGroup getAndConditionGroups(
        int index) {
      if (andConditionGroupsBuilder_ == null) {
        return andConditionGroups_.get(index);
      } else {
        return andConditionGroupsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * An event matches this criteria if the event matches each of these
     * `andConditionGroups`.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
     * </code>
     */
    public Builder setAndConditionGroups(
        int index, com.google.analytics.data.v1alpha.EventSegmentConditionGroup value) {
      if (andConditionGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAndConditionGroupsIsMutable();
        andConditionGroups_.set(index, value);
        onChanged();
      } else {
        andConditionGroupsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * An event matches this criteria if the event matches each of these
     * `andConditionGroups`.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
     * </code>
     */
    public Builder setAndConditionGroups(
        int index,
        com.google.analytics.data.v1alpha.EventSegmentConditionGroup.Builder builderForValue) {
      if (andConditionGroupsBuilder_ == null) {
        ensureAndConditionGroupsIsMutable();
        andConditionGroups_.set(index, builderForValue.build());
        onChanged();
      } else {
        andConditionGroupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * An event matches this criteria if the event matches each of these
     * `andConditionGroups`.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
     * </code>
     */
    public Builder addAndConditionGroups(
        com.google.analytics.data.v1alpha.EventSegmentConditionGroup value) {
      if (andConditionGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAndConditionGroupsIsMutable();
        andConditionGroups_.add(value);
        onChanged();
      } else {
        andConditionGroupsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * An event matches this criteria if the event matches each of these
     * `andConditionGroups`.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
     * </code>
     */
    public Builder addAndConditionGroups(
        int index, com.google.analytics.data.v1alpha.EventSegmentConditionGroup value) {
      if (andConditionGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAndConditionGroupsIsMutable();
        andConditionGroups_.add(index, value);
        onChanged();
      } else {
        andConditionGroupsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * An event matches this criteria if the event matches each of these
     * `andConditionGroups`.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
     * </code>
     */
    public Builder addAndConditionGroups(
        com.google.analytics.data.v1alpha.EventSegmentConditionGroup.Builder builderForValue) {
      if (andConditionGroupsBuilder_ == null) {
        ensureAndConditionGroupsIsMutable();
        andConditionGroups_.add(builderForValue.build());
        onChanged();
      } else {
        andConditionGroupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * An event matches this criteria if the event matches each of these
     * `andConditionGroups`.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
     * </code>
     */
    public Builder addAndConditionGroups(
        int index,
        com.google.analytics.data.v1alpha.EventSegmentConditionGroup.Builder builderForValue) {
      if (andConditionGroupsBuilder_ == null) {
        ensureAndConditionGroupsIsMutable();
        andConditionGroups_.add(index, builderForValue.build());
        onChanged();
      } else {
        andConditionGroupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * An event matches this criteria if the event matches each of these
     * `andConditionGroups`.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
     * </code>
     */
    public Builder addAllAndConditionGroups(
        java.lang.Iterable<? extends com.google.analytics.data.v1alpha.EventSegmentConditionGroup>
            values) {
      if (andConditionGroupsBuilder_ == null) {
        ensureAndConditionGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, andConditionGroups_);
        onChanged();
      } else {
        andConditionGroupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * An event matches this criteria if the event matches each of these
     * `andConditionGroups`.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
     * </code>
     */
    public Builder clearAndConditionGroups() {
      if (andConditionGroupsBuilder_ == null) {
        andConditionGroups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        andConditionGroupsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * An event matches this criteria if the event matches each of these
     * `andConditionGroups`.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
     * </code>
     */
    public Builder removeAndConditionGroups(int index) {
      if (andConditionGroupsBuilder_ == null) {
        ensureAndConditionGroupsIsMutable();
        andConditionGroups_.remove(index);
        onChanged();
      } else {
        andConditionGroupsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * An event matches this criteria if the event matches each of these
     * `andConditionGroups`.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
     * </code>
     */
    public com.google.analytics.data.v1alpha.EventSegmentConditionGroup.Builder
        getAndConditionGroupsBuilder(int index) {
      return getAndConditionGroupsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * An event matches this criteria if the event matches each of these
     * `andConditionGroups`.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
     * </code>
     */
    public com.google.analytics.data.v1alpha.EventSegmentConditionGroupOrBuilder
        getAndConditionGroupsOrBuilder(int index) {
      if (andConditionGroupsBuilder_ == null) {
        return andConditionGroups_.get(index);
      } else {
        return andConditionGroupsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * An event matches this criteria if the event matches each of these
     * `andConditionGroups`.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
     * </code>
     */
    public java.util.List<
            ? extends com.google.analytics.data.v1alpha.EventSegmentConditionGroupOrBuilder>
        getAndConditionGroupsOrBuilderList() {
      if (andConditionGroupsBuilder_ != null) {
        return andConditionGroupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(andConditionGroups_);
      }
    }
    /**
     *
     *
     * <pre>
     * An event matches this criteria if the event matches each of these
     * `andConditionGroups`.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
     * </code>
     */
    public com.google.analytics.data.v1alpha.EventSegmentConditionGroup.Builder
        addAndConditionGroupsBuilder() {
      return getAndConditionGroupsFieldBuilder()
          .addBuilder(
              com.google.analytics.data.v1alpha.EventSegmentConditionGroup.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * An event matches this criteria if the event matches each of these
     * `andConditionGroups`.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
     * </code>
     */
    public com.google.analytics.data.v1alpha.EventSegmentConditionGroup.Builder
        addAndConditionGroupsBuilder(int index) {
      return getAndConditionGroupsFieldBuilder()
          .addBuilder(
              index,
              com.google.analytics.data.v1alpha.EventSegmentConditionGroup.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * An event matches this criteria if the event matches each of these
     * `andConditionGroups`.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.data.v1alpha.EventSegmentConditionGroup and_condition_groups = 1;
     * </code>
     */
    public java.util.List<com.google.analytics.data.v1alpha.EventSegmentConditionGroup.Builder>
        getAndConditionGroupsBuilderList() {
      return getAndConditionGroupsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.data.v1alpha.EventSegmentConditionGroup,
            com.google.analytics.data.v1alpha.EventSegmentConditionGroup.Builder,
            com.google.analytics.data.v1alpha.EventSegmentConditionGroupOrBuilder>
        getAndConditionGroupsFieldBuilder() {
      if (andConditionGroupsBuilder_ == null) {
        andConditionGroupsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.data.v1alpha.EventSegmentConditionGroup,
                com.google.analytics.data.v1alpha.EventSegmentConditionGroup.Builder,
                com.google.analytics.data.v1alpha.EventSegmentConditionGroupOrBuilder>(
                andConditionGroups_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        andConditionGroups_ = null;
      }
      return andConditionGroupsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.EventSegmentCriteria)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.EventSegmentCriteria)
  private static final com.google.analytics.data.v1alpha.EventSegmentCriteria DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.EventSegmentCriteria();
  }

  public static com.google.analytics.data.v1alpha.EventSegmentCriteria getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventSegmentCriteria> PARSER =
      new com.google.protobuf.AbstractParser<EventSegmentCriteria>() {
        @java.lang.Override
        public EventSegmentCriteria parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventSegmentCriteria> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventSegmentCriteria> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.EventSegmentCriteria getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
