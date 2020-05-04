/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/recommendationengine/v1beta1/user_event_service.proto

package com.google.cloud.recommendationengine.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for CollectUserEvent method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommendationengine.v1beta1.CollectUserEventRequest}
 */
public final class CollectUserEventRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommendationengine.v1beta1.CollectUserEventRequest)
    CollectUserEventRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CollectUserEventRequest.newBuilder() to construct.
  private CollectUserEventRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CollectUserEventRequest() {
    parent_ = "";
    userEvent_ = "";
    uri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CollectUserEventRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CollectUserEventRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              userEvent_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              uri_ = s;
              break;
            }
          case 32:
            {
              ets_ = input.readInt64();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.recommendationengine.v1beta1.UserEventServiceOuterClass
        .internal_static_google_cloud_recommendationengine_v1beta1_CollectUserEventRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommendationengine.v1beta1.UserEventServiceOuterClass
        .internal_static_google_cloud_recommendationengine_v1beta1_CollectUserEventRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest.class,
            com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The parent eventStore name, such as
   * "projects/1234/locations/global/catalogs/default_catalog/eventStores/default_event_store".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent eventStore name, such as
   * "projects/1234/locations/global/catalogs/default_catalog/eventStores/default_event_store".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_EVENT_FIELD_NUMBER = 2;
  private volatile java.lang.Object userEvent_;
  /**
   *
   *
   * <pre>
   * Required. URL encoded UserEvent proto.
   * </pre>
   *
   * <code>string user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The userEvent.
   */
  public java.lang.String getUserEvent() {
    java.lang.Object ref = userEvent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userEvent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. URL encoded UserEvent proto.
   * </pre>
   *
   * <code>string user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for userEvent.
   */
  public com.google.protobuf.ByteString getUserEventBytes() {
    java.lang.Object ref = userEvent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      userEvent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URI_FIELD_NUMBER = 3;
  private volatile java.lang.Object uri_;
  /**
   *
   *
   * <pre>
   * Optional. The url including cgi-parameters but excluding the hash fragment.
   * The URL must be truncated to 1.5K bytes to conservatively be under the 2K
   * bytes. This is often more useful than the referer url, because many
   * browsers only send the domain for 3rd party requests.
   * </pre>
   *
   * <code>string uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The uri.
   */
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The url including cgi-parameters but excluding the hash fragment.
   * The URL must be truncated to 1.5K bytes to conservatively be under the 2K
   * bytes. This is often more useful than the referer url, because many
   * browsers only send the domain for 3rd party requests.
   * </pre>
   *
   * <code>string uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for uri.
   */
  public com.google.protobuf.ByteString getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      uri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ETS_FIELD_NUMBER = 4;
  private long ets_;
  /**
   *
   *
   * <pre>
   * Optional. The event timestamp in milliseconds. This prevents browser
   * caching of otherwise identical get requests. The name is abbreviated to
   * reduce the payload bytes.
   * </pre>
   *
   * <code>int64 ets = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The ets.
   */
  public long getEts() {
    return ets_;
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!getUserEventBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userEvent_);
    }
    if (!getUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, uri_);
    }
    if (ets_ != 0L) {
      output.writeInt64(4, ets_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!getUserEventBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userEvent_);
    }
    if (!getUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, uri_);
    }
    if (ets_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(4, ets_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest other =
        (com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getUserEvent().equals(other.getUserEvent())) return false;
    if (!getUri().equals(other.getUri())) return false;
    if (getEts() != other.getEts()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + USER_EVENT_FIELD_NUMBER;
    hash = (53 * hash) + getUserEvent().hashCode();
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    hash = (37 * hash) + ETS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getEts());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest parseFrom(
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
      com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest prototype) {
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
   * Request message for CollectUserEvent method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommendationengine.v1beta1.CollectUserEventRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommendationengine.v1beta1.CollectUserEventRequest)
      com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.recommendationengine.v1beta1.UserEventServiceOuterClass
          .internal_static_google_cloud_recommendationengine_v1beta1_CollectUserEventRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommendationengine.v1beta1.UserEventServiceOuterClass
          .internal_static_google_cloud_recommendationengine_v1beta1_CollectUserEventRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest.class,
              com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      userEvent_ = "";

      uri_ = "";

      ets_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.recommendationengine.v1beta1.UserEventServiceOuterClass
          .internal_static_google_cloud_recommendationengine_v1beta1_CollectUserEventRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest
        getDefaultInstanceForType() {
      return com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest build() {
      com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest buildPartial() {
      com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest result =
          new com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest(this);
      result.parent_ = parent_;
      result.userEvent_ = userEvent_;
      result.uri_ = uri_;
      result.ets_ = ets_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest) {
        return mergeFrom(
            (com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest other) {
      if (other
          == com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getUserEvent().isEmpty()) {
        userEvent_ = other.userEvent_;
        onChanged();
      }
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        onChanged();
      }
      if (other.getEts() != 0L) {
        setEts(other.getEts());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent eventStore name, such as
     * "projects/1234/locations/global/catalogs/default_catalog/eventStores/default_event_store".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent eventStore name, such as
     * "projects/1234/locations/global/catalogs/default_catalog/eventStores/default_event_store".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent eventStore name, such as
     * "projects/1234/locations/global/catalogs/default_catalog/eventStores/default_event_store".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent eventStore name, such as
     * "projects/1234/locations/global/catalogs/default_catalog/eventStores/default_event_store".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent eventStore name, such as
     * "projects/1234/locations/global/catalogs/default_catalog/eventStores/default_event_store".
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userEvent_ = "";
    /**
     *
     *
     * <pre>
     * Required. URL encoded UserEvent proto.
     * </pre>
     *
     * <code>string user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The userEvent.
     */
    public java.lang.String getUserEvent() {
      java.lang.Object ref = userEvent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userEvent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. URL encoded UserEvent proto.
     * </pre>
     *
     * <code>string user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for userEvent.
     */
    public com.google.protobuf.ByteString getUserEventBytes() {
      java.lang.Object ref = userEvent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        userEvent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. URL encoded UserEvent proto.
     * </pre>
     *
     * <code>string user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The userEvent to set.
     * @return This builder for chaining.
     */
    public Builder setUserEvent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      userEvent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. URL encoded UserEvent proto.
     * </pre>
     *
     * <code>string user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUserEvent() {

      userEvent_ = getDefaultInstance().getUserEvent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. URL encoded UserEvent proto.
     * </pre>
     *
     * <code>string user_event = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for userEvent to set.
     * @return This builder for chaining.
     */
    public Builder setUserEventBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      userEvent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object uri_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The url including cgi-parameters but excluding the hash fragment.
     * The URL must be truncated to 1.5K bytes to conservatively be under the 2K
     * bytes. This is often more useful than the referer url, because many
     * browsers only send the domain for 3rd party requests.
     * </pre>
     *
     * <code>string uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The uri.
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The url including cgi-parameters but excluding the hash fragment.
     * The URL must be truncated to 1.5K bytes to conservatively be under the 2K
     * bytes. This is often more useful than the referer url, because many
     * browsers only send the domain for 3rd party requests.
     * </pre>
     *
     * <code>string uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for uri.
     */
    public com.google.protobuf.ByteString getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The url including cgi-parameters but excluding the hash fragment.
     * The URL must be truncated to 1.5K bytes to conservatively be under the 2K
     * bytes. This is often more useful than the referer url, because many
     * browsers only send the domain for 3rd party requests.
     * </pre>
     *
     * <code>string uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      uri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The url including cgi-parameters but excluding the hash fragment.
     * The URL must be truncated to 1.5K bytes to conservatively be under the 2K
     * bytes. This is often more useful than the referer url, because many
     * browsers only send the domain for 3rd party requests.
     * </pre>
     *
     * <code>string uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUri() {

      uri_ = getDefaultInstance().getUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The url including cgi-parameters but excluding the hash fragment.
     * The URL must be truncated to 1.5K bytes to conservatively be under the 2K
     * bytes. This is often more useful than the referer url, because many
     * browsers only send the domain for 3rd party requests.
     * </pre>
     *
     * <code>string uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      uri_ = value;
      onChanged();
      return this;
    }

    private long ets_;
    /**
     *
     *
     * <pre>
     * Optional. The event timestamp in milliseconds. This prevents browser
     * caching of otherwise identical get requests. The name is abbreviated to
     * reduce the payload bytes.
     * </pre>
     *
     * <code>int64 ets = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The ets.
     */
    public long getEts() {
      return ets_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The event timestamp in milliseconds. This prevents browser
     * caching of otherwise identical get requests. The name is abbreviated to
     * reduce the payload bytes.
     * </pre>
     *
     * <code>int64 ets = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The ets to set.
     * @return This builder for chaining.
     */
    public Builder setEts(long value) {

      ets_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The event timestamp in milliseconds. This prevents browser
     * caching of otherwise identical get requests. The name is abbreviated to
     * reduce the payload bytes.
     * </pre>
     *
     * <code>int64 ets = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEts() {

      ets_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recommendationengine.v1beta1.CollectUserEventRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.CollectUserEventRequest)
  private static final com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest();
  }

  public static com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CollectUserEventRequest> PARSER =
      new com.google.protobuf.AbstractParser<CollectUserEventRequest>() {
        @java.lang.Override
        public CollectUserEventRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CollectUserEventRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CollectUserEventRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CollectUserEventRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.CollectUserEventRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
