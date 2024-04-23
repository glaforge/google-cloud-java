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
// source: google/chat/v1/thread_read_state.proto

// Protobuf Java Version: 3.25.3
package com.google.chat.v1;

/**
 *
 *
 * <pre>
 * A user's read state within a thread, used to identify read and unread
 * messages.
 * </pre>
 *
 * Protobuf type {@code google.chat.v1.ThreadReadState}
 */
public final class ThreadReadState extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.chat.v1.ThreadReadState)
    ThreadReadStateOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ThreadReadState.newBuilder() to construct.
  private ThreadReadState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ThreadReadState() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ThreadReadState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.chat.v1.ThreadReadStateProto
        .internal_static_google_chat_v1_ThreadReadState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.chat.v1.ThreadReadStateProto
        .internal_static_google_chat_v1_ThreadReadState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.chat.v1.ThreadReadState.class,
            com.google.chat.v1.ThreadReadState.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Resource name of the thread read state.
   *
   * Format: `users/{user}/spaces/{space}/threads/{thread}/threadReadState`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Resource name of the thread read state.
   *
   * Format: `users/{user}/spaces/{space}/threads/{thread}/threadReadState`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAST_READ_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp lastReadTime_;
  /**
   *
   *
   * <pre>
   * The time when the user's thread read state was updated. Usually this
   * corresponds with the timestamp of the last read message in a thread.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_read_time = 2;</code>
   *
   * @return Whether the lastReadTime field is set.
   */
  @java.lang.Override
  public boolean hasLastReadTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The time when the user's thread read state was updated. Usually this
   * corresponds with the timestamp of the last read message in a thread.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_read_time = 2;</code>
   *
   * @return The lastReadTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getLastReadTime() {
    return lastReadTime_ == null
        ? com.google.protobuf.Timestamp.getDefaultInstance()
        : lastReadTime_;
  }
  /**
   *
   *
   * <pre>
   * The time when the user's thread read state was updated. Usually this
   * corresponds with the timestamp of the last read message in a thread.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_read_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getLastReadTimeOrBuilder() {
    return lastReadTime_ == null
        ? com.google.protobuf.Timestamp.getDefaultInstance()
        : lastReadTime_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getLastReadTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getLastReadTime());
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
    if (!(obj instanceof com.google.chat.v1.ThreadReadState)) {
      return super.equals(obj);
    }
    com.google.chat.v1.ThreadReadState other = (com.google.chat.v1.ThreadReadState) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasLastReadTime() != other.hasLastReadTime()) return false;
    if (hasLastReadTime()) {
      if (!getLastReadTime().equals(other.getLastReadTime())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasLastReadTime()) {
      hash = (37 * hash) + LAST_READ_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getLastReadTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.chat.v1.ThreadReadState parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.ThreadReadState parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.ThreadReadState parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.ThreadReadState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.ThreadReadState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.ThreadReadState parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.ThreadReadState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.ThreadReadState parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.ThreadReadState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.ThreadReadState parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.ThreadReadState parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.ThreadReadState parseFrom(
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

  public static Builder newBuilder(com.google.chat.v1.ThreadReadState prototype) {
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
   * A user's read state within a thread, used to identify read and unread
   * messages.
   * </pre>
   *
   * Protobuf type {@code google.chat.v1.ThreadReadState}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.chat.v1.ThreadReadState)
      com.google.chat.v1.ThreadReadStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.chat.v1.ThreadReadStateProto
          .internal_static_google_chat_v1_ThreadReadState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.chat.v1.ThreadReadStateProto
          .internal_static_google_chat_v1_ThreadReadState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.chat.v1.ThreadReadState.class,
              com.google.chat.v1.ThreadReadState.Builder.class);
    }

    // Construct using com.google.chat.v1.ThreadReadState.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getLastReadTimeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      lastReadTime_ = null;
      if (lastReadTimeBuilder_ != null) {
        lastReadTimeBuilder_.dispose();
        lastReadTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.chat.v1.ThreadReadStateProto
          .internal_static_google_chat_v1_ThreadReadState_descriptor;
    }

    @java.lang.Override
    public com.google.chat.v1.ThreadReadState getDefaultInstanceForType() {
      return com.google.chat.v1.ThreadReadState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.chat.v1.ThreadReadState build() {
      com.google.chat.v1.ThreadReadState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.chat.v1.ThreadReadState buildPartial() {
      com.google.chat.v1.ThreadReadState result = new com.google.chat.v1.ThreadReadState(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.chat.v1.ThreadReadState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.lastReadTime_ =
            lastReadTimeBuilder_ == null ? lastReadTime_ : lastReadTimeBuilder_.build();
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
      if (other instanceof com.google.chat.v1.ThreadReadState) {
        return mergeFrom((com.google.chat.v1.ThreadReadState) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.chat.v1.ThreadReadState other) {
      if (other == com.google.chat.v1.ThreadReadState.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasLastReadTime()) {
        mergeLastReadTime(other.getLastReadTime());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getLastReadTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Resource name of the thread read state.
     *
     * Format: `users/{user}/spaces/{space}/threads/{thread}/threadReadState`
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of the thread read state.
     *
     * Format: `users/{user}/spaces/{space}/threads/{thread}/threadReadState`
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of the thread read state.
     *
     * Format: `users/{user}/spaces/{space}/threads/{thread}/threadReadState`
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of the thread read state.
     *
     * Format: `users/{user}/spaces/{space}/threads/{thread}/threadReadState`
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of the thread read state.
     *
     * Format: `users/{user}/spaces/{space}/threads/{thread}/threadReadState`
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp lastReadTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        lastReadTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The time when the user's thread read state was updated. Usually this
     * corresponds with the timestamp of the last read message in a thread.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_read_time = 2;</code>
     *
     * @return Whether the lastReadTime field is set.
     */
    public boolean hasLastReadTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The time when the user's thread read state was updated. Usually this
     * corresponds with the timestamp of the last read message in a thread.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_read_time = 2;</code>
     *
     * @return The lastReadTime.
     */
    public com.google.protobuf.Timestamp getLastReadTime() {
      if (lastReadTimeBuilder_ == null) {
        return lastReadTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : lastReadTime_;
      } else {
        return lastReadTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The time when the user's thread read state was updated. Usually this
     * corresponds with the timestamp of the last read message in a thread.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_read_time = 2;</code>
     */
    public Builder setLastReadTime(com.google.protobuf.Timestamp value) {
      if (lastReadTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastReadTime_ = value;
      } else {
        lastReadTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the user's thread read state was updated. Usually this
     * corresponds with the timestamp of the last read message in a thread.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_read_time = 2;</code>
     */
    public Builder setLastReadTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (lastReadTimeBuilder_ == null) {
        lastReadTime_ = builderForValue.build();
      } else {
        lastReadTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the user's thread read state was updated. Usually this
     * corresponds with the timestamp of the last read message in a thread.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_read_time = 2;</code>
     */
    public Builder mergeLastReadTime(com.google.protobuf.Timestamp value) {
      if (lastReadTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && lastReadTime_ != null
            && lastReadTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getLastReadTimeBuilder().mergeFrom(value);
        } else {
          lastReadTime_ = value;
        }
      } else {
        lastReadTimeBuilder_.mergeFrom(value);
      }
      if (lastReadTime_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the user's thread read state was updated. Usually this
     * corresponds with the timestamp of the last read message in a thread.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_read_time = 2;</code>
     */
    public Builder clearLastReadTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      lastReadTime_ = null;
      if (lastReadTimeBuilder_ != null) {
        lastReadTimeBuilder_.dispose();
        lastReadTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when the user's thread read state was updated. Usually this
     * corresponds with the timestamp of the last read message in a thread.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_read_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getLastReadTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getLastReadTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The time when the user's thread read state was updated. Usually this
     * corresponds with the timestamp of the last read message in a thread.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_read_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getLastReadTimeOrBuilder() {
      if (lastReadTimeBuilder_ != null) {
        return lastReadTimeBuilder_.getMessageOrBuilder();
      } else {
        return lastReadTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : lastReadTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The time when the user's thread read state was updated. Usually this
     * corresponds with the timestamp of the last read message in a thread.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_read_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getLastReadTimeFieldBuilder() {
      if (lastReadTimeBuilder_ == null) {
        lastReadTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getLastReadTime(), getParentForChildren(), isClean());
        lastReadTime_ = null;
      }
      return lastReadTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.chat.v1.ThreadReadState)
  }

  // @@protoc_insertion_point(class_scope:google.chat.v1.ThreadReadState)
  private static final com.google.chat.v1.ThreadReadState DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.chat.v1.ThreadReadState();
  }

  public static com.google.chat.v1.ThreadReadState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThreadReadState> PARSER =
      new com.google.protobuf.AbstractParser<ThreadReadState>() {
        @java.lang.Override
        public ThreadReadState parsePartialFrom(
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

  public static com.google.protobuf.Parser<ThreadReadState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThreadReadState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.chat.v1.ThreadReadState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
