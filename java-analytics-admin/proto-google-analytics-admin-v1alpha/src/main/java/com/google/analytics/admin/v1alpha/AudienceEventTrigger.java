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
// source: google/analytics/admin/v1alpha/audience.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Specifies an event to log when a user joins the Audience.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.AudienceEventTrigger}
 */
public final class AudienceEventTrigger extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.AudienceEventTrigger)
    AudienceEventTriggerOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AudienceEventTrigger.newBuilder() to construct.
  private AudienceEventTrigger(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AudienceEventTrigger() {
    eventName_ = "";
    logCondition_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AudienceEventTrigger();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AudienceProto
        .internal_static_google_analytics_admin_v1alpha_AudienceEventTrigger_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AudienceProto
        .internal_static_google_analytics_admin_v1alpha_AudienceEventTrigger_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.AudienceEventTrigger.class,
            com.google.analytics.admin.v1alpha.AudienceEventTrigger.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Determines when to log the event.
   * </pre>
   *
   * Protobuf enum {@code google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition}
   */
  public enum LogCondition implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Log condition is not specified.
     * </pre>
     *
     * <code>LOG_CONDITION_UNSPECIFIED = 0;</code>
     */
    LOG_CONDITION_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The event should be logged only when a user is joined.
     * </pre>
     *
     * <code>AUDIENCE_JOINED = 1;</code>
     */
    AUDIENCE_JOINED(1),
    /**
     *
     *
     * <pre>
     * The event should be logged whenever the Audience condition is met, even
     * if the user is already a member of the Audience.
     * </pre>
     *
     * <code>AUDIENCE_MEMBERSHIP_RENEWED = 2;</code>
     */
    AUDIENCE_MEMBERSHIP_RENEWED(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Log condition is not specified.
     * </pre>
     *
     * <code>LOG_CONDITION_UNSPECIFIED = 0;</code>
     */
    public static final int LOG_CONDITION_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The event should be logged only when a user is joined.
     * </pre>
     *
     * <code>AUDIENCE_JOINED = 1;</code>
     */
    public static final int AUDIENCE_JOINED_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The event should be logged whenever the Audience condition is met, even
     * if the user is already a member of the Audience.
     * </pre>
     *
     * <code>AUDIENCE_MEMBERSHIP_RENEWED = 2;</code>
     */
    public static final int AUDIENCE_MEMBERSHIP_RENEWED_VALUE = 2;

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
    public static LogCondition valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LogCondition forNumber(int value) {
      switch (value) {
        case 0:
          return LOG_CONDITION_UNSPECIFIED;
        case 1:
          return AUDIENCE_JOINED;
        case 2:
          return AUDIENCE_MEMBERSHIP_RENEWED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LogCondition> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<LogCondition> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LogCondition>() {
          public LogCondition findValueByNumber(int number) {
            return LogCondition.forNumber(number);
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
      return com.google.analytics.admin.v1alpha.AudienceEventTrigger.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final LogCondition[] VALUES = values();

    public static LogCondition valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LogCondition(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition)
  }

  public static final int EVENT_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object eventName_ = "";
  /**
   *
   *
   * <pre>
   * Required. The event name that will be logged.
   * </pre>
   *
   * <code>string event_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The eventName.
   */
  @java.lang.Override
  public java.lang.String getEventName() {
    java.lang.Object ref = eventName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The event name that will be logged.
   * </pre>
   *
   * <code>string event_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for eventName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEventNameBytes() {
    java.lang.Object ref = eventName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      eventName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOG_CONDITION_FIELD_NUMBER = 2;
  private int logCondition_ = 0;
  /**
   *
   *
   * <pre>
   * Required. When to log the event.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition log_condition = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for logCondition.
   */
  @java.lang.Override
  public int getLogConditionValue() {
    return logCondition_;
  }
  /**
   *
   *
   * <pre>
   * Required. When to log the event.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition log_condition = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The logCondition.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition getLogCondition() {
    com.google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition result =
        com.google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition.forNumber(
            logCondition_);
    return result == null
        ? com.google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition.UNRECOGNIZED
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, eventName_);
    }
    if (logCondition_
        != com.google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition
            .LOG_CONDITION_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, logCondition_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, eventName_);
    }
    if (logCondition_
        != com.google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition
            .LOG_CONDITION_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, logCondition_);
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.AudienceEventTrigger)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.AudienceEventTrigger other =
        (com.google.analytics.admin.v1alpha.AudienceEventTrigger) obj;

    if (!getEventName().equals(other.getEventName())) return false;
    if (logCondition_ != other.logCondition_) return false;
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
    hash = (37 * hash) + EVENT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getEventName().hashCode();
    hash = (37 * hash) + LOG_CONDITION_FIELD_NUMBER;
    hash = (53 * hash) + logCondition_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventTrigger parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventTrigger parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventTrigger parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventTrigger parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventTrigger parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventTrigger parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventTrigger parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventTrigger parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventTrigger parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventTrigger parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventTrigger parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventTrigger parseFrom(
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
      com.google.analytics.admin.v1alpha.AudienceEventTrigger prototype) {
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
   * Specifies an event to log when a user joins the Audience.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.AudienceEventTrigger}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.AudienceEventTrigger)
      com.google.analytics.admin.v1alpha.AudienceEventTriggerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AudienceProto
          .internal_static_google_analytics_admin_v1alpha_AudienceEventTrigger_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AudienceProto
          .internal_static_google_analytics_admin_v1alpha_AudienceEventTrigger_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.AudienceEventTrigger.class,
              com.google.analytics.admin.v1alpha.AudienceEventTrigger.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.AudienceEventTrigger.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      eventName_ = "";
      logCondition_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AudienceProto
          .internal_static_google_analytics_admin_v1alpha_AudienceEventTrigger_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AudienceEventTrigger getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.AudienceEventTrigger.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AudienceEventTrigger build() {
      com.google.analytics.admin.v1alpha.AudienceEventTrigger result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AudienceEventTrigger buildPartial() {
      com.google.analytics.admin.v1alpha.AudienceEventTrigger result =
          new com.google.analytics.admin.v1alpha.AudienceEventTrigger(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.admin.v1alpha.AudienceEventTrigger result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.eventName_ = eventName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.logCondition_ = logCondition_;
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
      if (other instanceof com.google.analytics.admin.v1alpha.AudienceEventTrigger) {
        return mergeFrom((com.google.analytics.admin.v1alpha.AudienceEventTrigger) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.AudienceEventTrigger other) {
      if (other == com.google.analytics.admin.v1alpha.AudienceEventTrigger.getDefaultInstance())
        return this;
      if (!other.getEventName().isEmpty()) {
        eventName_ = other.eventName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.logCondition_ != 0) {
        setLogConditionValue(other.getLogConditionValue());
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
                eventName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                logCondition_ = input.readEnum();
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

    private java.lang.Object eventName_ = "";
    /**
     *
     *
     * <pre>
     * Required. The event name that will be logged.
     * </pre>
     *
     * <code>string event_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The eventName.
     */
    public java.lang.String getEventName() {
      java.lang.Object ref = eventName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The event name that will be logged.
     * </pre>
     *
     * <code>string event_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for eventName.
     */
    public com.google.protobuf.ByteString getEventNameBytes() {
      java.lang.Object ref = eventName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        eventName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The event name that will be logged.
     * </pre>
     *
     * <code>string event_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The eventName to set.
     * @return This builder for chaining.
     */
    public Builder setEventName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      eventName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The event name that will be logged.
     * </pre>
     *
     * <code>string event_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEventName() {
      eventName_ = getDefaultInstance().getEventName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The event name that will be logged.
     * </pre>
     *
     * <code>string event_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for eventName to set.
     * @return This builder for chaining.
     */
    public Builder setEventNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      eventName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int logCondition_ = 0;
    /**
     *
     *
     * <pre>
     * Required. When to log the event.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition log_condition = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for logCondition.
     */
    @java.lang.Override
    public int getLogConditionValue() {
      return logCondition_;
    }
    /**
     *
     *
     * <pre>
     * Required. When to log the event.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition log_condition = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for logCondition to set.
     * @return This builder for chaining.
     */
    public Builder setLogConditionValue(int value) {
      logCondition_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. When to log the event.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition log_condition = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The logCondition.
     */
    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition getLogCondition() {
      com.google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition result =
          com.google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition.forNumber(
              logCondition_);
      return result == null
          ? com.google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required. When to log the event.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition log_condition = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The logCondition to set.
     * @return This builder for chaining.
     */
    public Builder setLogCondition(
        com.google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      logCondition_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. When to log the event.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition log_condition = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLogCondition() {
      bitField0_ = (bitField0_ & ~0x00000002);
      logCondition_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.AudienceEventTrigger)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.AudienceEventTrigger)
  private static final com.google.analytics.admin.v1alpha.AudienceEventTrigger DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.AudienceEventTrigger();
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventTrigger getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AudienceEventTrigger> PARSER =
      new com.google.protobuf.AbstractParser<AudienceEventTrigger>() {
        @java.lang.Override
        public AudienceEventTrigger parsePartialFrom(
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

  public static com.google.protobuf.Parser<AudienceEventTrigger> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AudienceEventTrigger> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AudienceEventTrigger getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
