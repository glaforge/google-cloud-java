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
// source: google/apps/meet/v2beta/service.proto

// Protobuf Java Version: 3.25.3
package com.google.apps.meet.v2beta;

/**
 *
 *
 * <pre>
 * Response for ListRecordings method.
 * </pre>
 *
 * Protobuf type {@code google.apps.meet.v2beta.ListRecordingsResponse}
 */
public final class ListRecordingsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.apps.meet.v2beta.ListRecordingsResponse)
    ListRecordingsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListRecordingsResponse.newBuilder() to construct.
  private ListRecordingsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListRecordingsResponse() {
    recordings_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListRecordingsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.apps.meet.v2beta.ServiceProto
        .internal_static_google_apps_meet_v2beta_ListRecordingsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.meet.v2beta.ServiceProto
        .internal_static_google_apps_meet_v2beta_ListRecordingsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.meet.v2beta.ListRecordingsResponse.class,
            com.google.apps.meet.v2beta.ListRecordingsResponse.Builder.class);
  }

  public static final int RECORDINGS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.apps.meet.v2beta.Recording> recordings_;
  /**
   *
   *
   * <pre>
   * List of recordings in one page.
   * </pre>
   *
   * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.apps.meet.v2beta.Recording> getRecordingsList() {
    return recordings_;
  }
  /**
   *
   *
   * <pre>
   * List of recordings in one page.
   * </pre>
   *
   * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.apps.meet.v2beta.RecordingOrBuilder>
      getRecordingsOrBuilderList() {
    return recordings_;
  }
  /**
   *
   *
   * <pre>
   * List of recordings in one page.
   * </pre>
   *
   * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
   */
  @java.lang.Override
  public int getRecordingsCount() {
    return recordings_.size();
  }
  /**
   *
   *
   * <pre>
   * List of recordings in one page.
   * </pre>
   *
   * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
   */
  @java.lang.Override
  public com.google.apps.meet.v2beta.Recording getRecordings(int index) {
    return recordings_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of recordings in one page.
   * </pre>
   *
   * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
   */
  @java.lang.Override
  public com.google.apps.meet.v2beta.RecordingOrBuilder getRecordingsOrBuilder(int index) {
    return recordings_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Token to be circulated back for further List call if current List doesn't
   * include all the recordings. Unset if all recordings are returned.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Token to be circulated back for further List call if current List doesn't
   * include all the recordings. Unset if all recordings are returned.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < recordings_.size(); i++) {
      output.writeMessage(1, recordings_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < recordings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, recordings_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.apps.meet.v2beta.ListRecordingsResponse)) {
      return super.equals(obj);
    }
    com.google.apps.meet.v2beta.ListRecordingsResponse other =
        (com.google.apps.meet.v2beta.ListRecordingsResponse) obj;

    if (!getRecordingsList().equals(other.getRecordingsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getRecordingsCount() > 0) {
      hash = (37 * hash) + RECORDINGS_FIELD_NUMBER;
      hash = (53 * hash) + getRecordingsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.meet.v2beta.ListRecordingsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.meet.v2beta.ListRecordingsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.meet.v2beta.ListRecordingsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.meet.v2beta.ListRecordingsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.meet.v2beta.ListRecordingsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.meet.v2beta.ListRecordingsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.meet.v2beta.ListRecordingsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.meet.v2beta.ListRecordingsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.meet.v2beta.ListRecordingsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.apps.meet.v2beta.ListRecordingsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.meet.v2beta.ListRecordingsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.meet.v2beta.ListRecordingsResponse parseFrom(
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

  public static Builder newBuilder(com.google.apps.meet.v2beta.ListRecordingsResponse prototype) {
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
   * Response for ListRecordings method.
   * </pre>
   *
   * Protobuf type {@code google.apps.meet.v2beta.ListRecordingsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.apps.meet.v2beta.ListRecordingsResponse)
      com.google.apps.meet.v2beta.ListRecordingsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.apps.meet.v2beta.ServiceProto
          .internal_static_google_apps_meet_v2beta_ListRecordingsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.meet.v2beta.ServiceProto
          .internal_static_google_apps_meet_v2beta_ListRecordingsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.meet.v2beta.ListRecordingsResponse.class,
              com.google.apps.meet.v2beta.ListRecordingsResponse.Builder.class);
    }

    // Construct using com.google.apps.meet.v2beta.ListRecordingsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (recordingsBuilder_ == null) {
        recordings_ = java.util.Collections.emptyList();
      } else {
        recordings_ = null;
        recordingsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.apps.meet.v2beta.ServiceProto
          .internal_static_google_apps_meet_v2beta_ListRecordingsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.apps.meet.v2beta.ListRecordingsResponse getDefaultInstanceForType() {
      return com.google.apps.meet.v2beta.ListRecordingsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.meet.v2beta.ListRecordingsResponse build() {
      com.google.apps.meet.v2beta.ListRecordingsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.meet.v2beta.ListRecordingsResponse buildPartial() {
      com.google.apps.meet.v2beta.ListRecordingsResponse result =
          new com.google.apps.meet.v2beta.ListRecordingsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.apps.meet.v2beta.ListRecordingsResponse result) {
      if (recordingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          recordings_ = java.util.Collections.unmodifiableList(recordings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.recordings_ = recordings_;
      } else {
        result.recordings_ = recordingsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.apps.meet.v2beta.ListRecordingsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.apps.meet.v2beta.ListRecordingsResponse) {
        return mergeFrom((com.google.apps.meet.v2beta.ListRecordingsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.meet.v2beta.ListRecordingsResponse other) {
      if (other == com.google.apps.meet.v2beta.ListRecordingsResponse.getDefaultInstance())
        return this;
      if (recordingsBuilder_ == null) {
        if (!other.recordings_.isEmpty()) {
          if (recordings_.isEmpty()) {
            recordings_ = other.recordings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRecordingsIsMutable();
            recordings_.addAll(other.recordings_);
          }
          onChanged();
        }
      } else {
        if (!other.recordings_.isEmpty()) {
          if (recordingsBuilder_.isEmpty()) {
            recordingsBuilder_.dispose();
            recordingsBuilder_ = null;
            recordings_ = other.recordings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            recordingsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRecordingsFieldBuilder()
                    : null;
          } else {
            recordingsBuilder_.addAllMessages(other.recordings_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
            case 10:
              {
                com.google.apps.meet.v2beta.Recording m =
                    input.readMessage(
                        com.google.apps.meet.v2beta.Recording.parser(), extensionRegistry);
                if (recordingsBuilder_ == null) {
                  ensureRecordingsIsMutable();
                  recordings_.add(m);
                } else {
                  recordingsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.apps.meet.v2beta.Recording> recordings_ =
        java.util.Collections.emptyList();

    private void ensureRecordingsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        recordings_ = new java.util.ArrayList<com.google.apps.meet.v2beta.Recording>(recordings_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.apps.meet.v2beta.Recording,
            com.google.apps.meet.v2beta.Recording.Builder,
            com.google.apps.meet.v2beta.RecordingOrBuilder>
        recordingsBuilder_;

    /**
     *
     *
     * <pre>
     * List of recordings in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
     */
    public java.util.List<com.google.apps.meet.v2beta.Recording> getRecordingsList() {
      if (recordingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(recordings_);
      } else {
        return recordingsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of recordings in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
     */
    public int getRecordingsCount() {
      if (recordingsBuilder_ == null) {
        return recordings_.size();
      } else {
        return recordingsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of recordings in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
     */
    public com.google.apps.meet.v2beta.Recording getRecordings(int index) {
      if (recordingsBuilder_ == null) {
        return recordings_.get(index);
      } else {
        return recordingsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of recordings in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
     */
    public Builder setRecordings(int index, com.google.apps.meet.v2beta.Recording value) {
      if (recordingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordingsIsMutable();
        recordings_.set(index, value);
        onChanged();
      } else {
        recordingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of recordings in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
     */
    public Builder setRecordings(
        int index, com.google.apps.meet.v2beta.Recording.Builder builderForValue) {
      if (recordingsBuilder_ == null) {
        ensureRecordingsIsMutable();
        recordings_.set(index, builderForValue.build());
        onChanged();
      } else {
        recordingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of recordings in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
     */
    public Builder addRecordings(com.google.apps.meet.v2beta.Recording value) {
      if (recordingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordingsIsMutable();
        recordings_.add(value);
        onChanged();
      } else {
        recordingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of recordings in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
     */
    public Builder addRecordings(int index, com.google.apps.meet.v2beta.Recording value) {
      if (recordingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecordingsIsMutable();
        recordings_.add(index, value);
        onChanged();
      } else {
        recordingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of recordings in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
     */
    public Builder addRecordings(com.google.apps.meet.v2beta.Recording.Builder builderForValue) {
      if (recordingsBuilder_ == null) {
        ensureRecordingsIsMutable();
        recordings_.add(builderForValue.build());
        onChanged();
      } else {
        recordingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of recordings in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
     */
    public Builder addRecordings(
        int index, com.google.apps.meet.v2beta.Recording.Builder builderForValue) {
      if (recordingsBuilder_ == null) {
        ensureRecordingsIsMutable();
        recordings_.add(index, builderForValue.build());
        onChanged();
      } else {
        recordingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of recordings in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
     */
    public Builder addAllRecordings(
        java.lang.Iterable<? extends com.google.apps.meet.v2beta.Recording> values) {
      if (recordingsBuilder_ == null) {
        ensureRecordingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, recordings_);
        onChanged();
      } else {
        recordingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of recordings in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
     */
    public Builder clearRecordings() {
      if (recordingsBuilder_ == null) {
        recordings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        recordingsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of recordings in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
     */
    public Builder removeRecordings(int index) {
      if (recordingsBuilder_ == null) {
        ensureRecordingsIsMutable();
        recordings_.remove(index);
        onChanged();
      } else {
        recordingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of recordings in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
     */
    public com.google.apps.meet.v2beta.Recording.Builder getRecordingsBuilder(int index) {
      return getRecordingsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of recordings in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
     */
    public com.google.apps.meet.v2beta.RecordingOrBuilder getRecordingsOrBuilder(int index) {
      if (recordingsBuilder_ == null) {
        return recordings_.get(index);
      } else {
        return recordingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of recordings in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
     */
    public java.util.List<? extends com.google.apps.meet.v2beta.RecordingOrBuilder>
        getRecordingsOrBuilderList() {
      if (recordingsBuilder_ != null) {
        return recordingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(recordings_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of recordings in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
     */
    public com.google.apps.meet.v2beta.Recording.Builder addRecordingsBuilder() {
      return getRecordingsFieldBuilder()
          .addBuilder(com.google.apps.meet.v2beta.Recording.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of recordings in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
     */
    public com.google.apps.meet.v2beta.Recording.Builder addRecordingsBuilder(int index) {
      return getRecordingsFieldBuilder()
          .addBuilder(index, com.google.apps.meet.v2beta.Recording.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of recordings in one page.
     * </pre>
     *
     * <code>repeated .google.apps.meet.v2beta.Recording recordings = 1;</code>
     */
    public java.util.List<com.google.apps.meet.v2beta.Recording.Builder>
        getRecordingsBuilderList() {
      return getRecordingsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.apps.meet.v2beta.Recording,
            com.google.apps.meet.v2beta.Recording.Builder,
            com.google.apps.meet.v2beta.RecordingOrBuilder>
        getRecordingsFieldBuilder() {
      if (recordingsBuilder_ == null) {
        recordingsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.apps.meet.v2beta.Recording,
                com.google.apps.meet.v2beta.Recording.Builder,
                com.google.apps.meet.v2beta.RecordingOrBuilder>(
                recordings_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        recordings_ = null;
      }
      return recordingsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to be circulated back for further List call if current List doesn't
     * include all the recordings. Unset if all recordings are returned.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to be circulated back for further List call if current List doesn't
     * include all the recordings. Unset if all recordings are returned.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to be circulated back for further List call if current List doesn't
     * include all the recordings. Unset if all recordings are returned.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to be circulated back for further List call if current List doesn't
     * include all the recordings. Unset if all recordings are returned.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to be circulated back for further List call if current List doesn't
     * include all the recordings. Unset if all recordings are returned.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.apps.meet.v2beta.ListRecordingsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.apps.meet.v2beta.ListRecordingsResponse)
  private static final com.google.apps.meet.v2beta.ListRecordingsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.apps.meet.v2beta.ListRecordingsResponse();
  }

  public static com.google.apps.meet.v2beta.ListRecordingsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListRecordingsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListRecordingsResponse>() {
        @java.lang.Override
        public ListRecordingsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListRecordingsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListRecordingsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.meet.v2beta.ListRecordingsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
