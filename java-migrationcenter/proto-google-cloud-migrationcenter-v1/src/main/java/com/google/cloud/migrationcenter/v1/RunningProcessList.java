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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.migrationcenter.v1;

/**
 *
 *
 * <pre>
 * List of running guest OS processes.
 * </pre>
 *
 * Protobuf type {@code google.cloud.migrationcenter.v1.RunningProcessList}
 */
public final class RunningProcessList extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.migrationcenter.v1.RunningProcessList)
    RunningProcessListOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RunningProcessList.newBuilder() to construct.
  private RunningProcessList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RunningProcessList() {
    entries_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RunningProcessList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto
        .internal_static_google_cloud_migrationcenter_v1_RunningProcessList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto
        .internal_static_google_cloud_migrationcenter_v1_RunningProcessList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.migrationcenter.v1.RunningProcessList.class,
            com.google.cloud.migrationcenter.v1.RunningProcessList.Builder.class);
  }

  public static final int ENTRIES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.migrationcenter.v1.RunningProcess> entries_;
  /**
   *
   *
   * <pre>
   * Running process entries.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.migrationcenter.v1.RunningProcess> getEntriesList() {
    return entries_;
  }
  /**
   *
   *
   * <pre>
   * Running process entries.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.migrationcenter.v1.RunningProcessOrBuilder>
      getEntriesOrBuilderList() {
    return entries_;
  }
  /**
   *
   *
   * <pre>
   * Running process entries.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
   */
  @java.lang.Override
  public int getEntriesCount() {
    return entries_.size();
  }
  /**
   *
   *
   * <pre>
   * Running process entries.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.RunningProcess getEntries(int index) {
    return entries_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Running process entries.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.RunningProcessOrBuilder getEntriesOrBuilder(
      int index) {
    return entries_.get(index);
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
    for (int i = 0; i < entries_.size(); i++) {
      output.writeMessage(1, entries_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < entries_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, entries_.get(i));
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
    if (!(obj instanceof com.google.cloud.migrationcenter.v1.RunningProcessList)) {
      return super.equals(obj);
    }
    com.google.cloud.migrationcenter.v1.RunningProcessList other =
        (com.google.cloud.migrationcenter.v1.RunningProcessList) obj;

    if (!getEntriesList().equals(other.getEntriesList())) return false;
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
    if (getEntriesCount() > 0) {
      hash = (37 * hash) + ENTRIES_FIELD_NUMBER;
      hash = (53 * hash) + getEntriesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.migrationcenter.v1.RunningProcessList parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.RunningProcessList parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.RunningProcessList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.RunningProcessList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.RunningProcessList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.RunningProcessList parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.RunningProcessList parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.RunningProcessList parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.RunningProcessList parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.RunningProcessList parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.RunningProcessList parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.RunningProcessList parseFrom(
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
      com.google.cloud.migrationcenter.v1.RunningProcessList prototype) {
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
   * List of running guest OS processes.
   * </pre>
   *
   * Protobuf type {@code google.cloud.migrationcenter.v1.RunningProcessList}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.migrationcenter.v1.RunningProcessList)
      com.google.cloud.migrationcenter.v1.RunningProcessListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_RunningProcessList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_RunningProcessList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.migrationcenter.v1.RunningProcessList.class,
              com.google.cloud.migrationcenter.v1.RunningProcessList.Builder.class);
    }

    // Construct using com.google.cloud.migrationcenter.v1.RunningProcessList.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (entriesBuilder_ == null) {
        entries_ = java.util.Collections.emptyList();
      } else {
        entries_ = null;
        entriesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_RunningProcessList_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.RunningProcessList getDefaultInstanceForType() {
      return com.google.cloud.migrationcenter.v1.RunningProcessList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.RunningProcessList build() {
      com.google.cloud.migrationcenter.v1.RunningProcessList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.RunningProcessList buildPartial() {
      com.google.cloud.migrationcenter.v1.RunningProcessList result =
          new com.google.cloud.migrationcenter.v1.RunningProcessList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.migrationcenter.v1.RunningProcessList result) {
      if (entriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          entries_ = java.util.Collections.unmodifiableList(entries_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entries_ = entries_;
      } else {
        result.entries_ = entriesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.migrationcenter.v1.RunningProcessList result) {
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
      if (other instanceof com.google.cloud.migrationcenter.v1.RunningProcessList) {
        return mergeFrom((com.google.cloud.migrationcenter.v1.RunningProcessList) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.migrationcenter.v1.RunningProcessList other) {
      if (other == com.google.cloud.migrationcenter.v1.RunningProcessList.getDefaultInstance())
        return this;
      if (entriesBuilder_ == null) {
        if (!other.entries_.isEmpty()) {
          if (entries_.isEmpty()) {
            entries_ = other.entries_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntriesIsMutable();
            entries_.addAll(other.entries_);
          }
          onChanged();
        }
      } else {
        if (!other.entries_.isEmpty()) {
          if (entriesBuilder_.isEmpty()) {
            entriesBuilder_.dispose();
            entriesBuilder_ = null;
            entries_ = other.entries_;
            bitField0_ = (bitField0_ & ~0x00000001);
            entriesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getEntriesFieldBuilder()
                    : null;
          } else {
            entriesBuilder_.addAllMessages(other.entries_);
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
                com.google.cloud.migrationcenter.v1.RunningProcess m =
                    input.readMessage(
                        com.google.cloud.migrationcenter.v1.RunningProcess.parser(),
                        extensionRegistry);
                if (entriesBuilder_ == null) {
                  ensureEntriesIsMutable();
                  entries_.add(m);
                } else {
                  entriesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.migrationcenter.v1.RunningProcess> entries_ =
        java.util.Collections.emptyList();

    private void ensureEntriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        entries_ =
            new java.util.ArrayList<com.google.cloud.migrationcenter.v1.RunningProcess>(entries_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.migrationcenter.v1.RunningProcess,
            com.google.cloud.migrationcenter.v1.RunningProcess.Builder,
            com.google.cloud.migrationcenter.v1.RunningProcessOrBuilder>
        entriesBuilder_;

    /**
     *
     *
     * <pre>
     * Running process entries.
     * </pre>
     *
     * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
     */
    public java.util.List<com.google.cloud.migrationcenter.v1.RunningProcess> getEntriesList() {
      if (entriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(entries_);
      } else {
        return entriesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Running process entries.
     * </pre>
     *
     * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
     */
    public int getEntriesCount() {
      if (entriesBuilder_ == null) {
        return entries_.size();
      } else {
        return entriesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Running process entries.
     * </pre>
     *
     * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
     */
    public com.google.cloud.migrationcenter.v1.RunningProcess getEntries(int index) {
      if (entriesBuilder_ == null) {
        return entries_.get(index);
      } else {
        return entriesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Running process entries.
     * </pre>
     *
     * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
     */
    public Builder setEntries(int index, com.google.cloud.migrationcenter.v1.RunningProcess value) {
      if (entriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntriesIsMutable();
        entries_.set(index, value);
        onChanged();
      } else {
        entriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Running process entries.
     * </pre>
     *
     * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
     */
    public Builder setEntries(
        int index, com.google.cloud.migrationcenter.v1.RunningProcess.Builder builderForValue) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        entries_.set(index, builderForValue.build());
        onChanged();
      } else {
        entriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Running process entries.
     * </pre>
     *
     * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
     */
    public Builder addEntries(com.google.cloud.migrationcenter.v1.RunningProcess value) {
      if (entriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntriesIsMutable();
        entries_.add(value);
        onChanged();
      } else {
        entriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Running process entries.
     * </pre>
     *
     * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
     */
    public Builder addEntries(int index, com.google.cloud.migrationcenter.v1.RunningProcess value) {
      if (entriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntriesIsMutable();
        entries_.add(index, value);
        onChanged();
      } else {
        entriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Running process entries.
     * </pre>
     *
     * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
     */
    public Builder addEntries(
        com.google.cloud.migrationcenter.v1.RunningProcess.Builder builderForValue) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        entries_.add(builderForValue.build());
        onChanged();
      } else {
        entriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Running process entries.
     * </pre>
     *
     * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
     */
    public Builder addEntries(
        int index, com.google.cloud.migrationcenter.v1.RunningProcess.Builder builderForValue) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        entries_.add(index, builderForValue.build());
        onChanged();
      } else {
        entriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Running process entries.
     * </pre>
     *
     * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
     */
    public Builder addAllEntries(
        java.lang.Iterable<? extends com.google.cloud.migrationcenter.v1.RunningProcess> values) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, entries_);
        onChanged();
      } else {
        entriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Running process entries.
     * </pre>
     *
     * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
     */
    public Builder clearEntries() {
      if (entriesBuilder_ == null) {
        entries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        entriesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Running process entries.
     * </pre>
     *
     * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
     */
    public Builder removeEntries(int index) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        entries_.remove(index);
        onChanged();
      } else {
        entriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Running process entries.
     * </pre>
     *
     * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
     */
    public com.google.cloud.migrationcenter.v1.RunningProcess.Builder getEntriesBuilder(int index) {
      return getEntriesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Running process entries.
     * </pre>
     *
     * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
     */
    public com.google.cloud.migrationcenter.v1.RunningProcessOrBuilder getEntriesOrBuilder(
        int index) {
      if (entriesBuilder_ == null) {
        return entries_.get(index);
      } else {
        return entriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Running process entries.
     * </pre>
     *
     * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.migrationcenter.v1.RunningProcessOrBuilder>
        getEntriesOrBuilderList() {
      if (entriesBuilder_ != null) {
        return entriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(entries_);
      }
    }
    /**
     *
     *
     * <pre>
     * Running process entries.
     * </pre>
     *
     * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
     */
    public com.google.cloud.migrationcenter.v1.RunningProcess.Builder addEntriesBuilder() {
      return getEntriesFieldBuilder()
          .addBuilder(com.google.cloud.migrationcenter.v1.RunningProcess.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Running process entries.
     * </pre>
     *
     * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
     */
    public com.google.cloud.migrationcenter.v1.RunningProcess.Builder addEntriesBuilder(int index) {
      return getEntriesFieldBuilder()
          .addBuilder(
              index, com.google.cloud.migrationcenter.v1.RunningProcess.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Running process entries.
     * </pre>
     *
     * <code>repeated .google.cloud.migrationcenter.v1.RunningProcess entries = 1;</code>
     */
    public java.util.List<com.google.cloud.migrationcenter.v1.RunningProcess.Builder>
        getEntriesBuilderList() {
      return getEntriesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.migrationcenter.v1.RunningProcess,
            com.google.cloud.migrationcenter.v1.RunningProcess.Builder,
            com.google.cloud.migrationcenter.v1.RunningProcessOrBuilder>
        getEntriesFieldBuilder() {
      if (entriesBuilder_ == null) {
        entriesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.migrationcenter.v1.RunningProcess,
                com.google.cloud.migrationcenter.v1.RunningProcess.Builder,
                com.google.cloud.migrationcenter.v1.RunningProcessOrBuilder>(
                entries_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        entries_ = null;
      }
      return entriesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.migrationcenter.v1.RunningProcessList)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.migrationcenter.v1.RunningProcessList)
  private static final com.google.cloud.migrationcenter.v1.RunningProcessList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.migrationcenter.v1.RunningProcessList();
  }

  public static com.google.cloud.migrationcenter.v1.RunningProcessList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RunningProcessList> PARSER =
      new com.google.protobuf.AbstractParser<RunningProcessList>() {
        @java.lang.Override
        public RunningProcessList parsePartialFrom(
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

  public static com.google.protobuf.Parser<RunningProcessList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RunningProcessList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.RunningProcessList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
