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
// source: google/monitoring/metricsscope/v1/metrics_scopes.proto

// Protobuf Java Version: 3.25.3
package com.google.monitoring.metricsscope.v1;

/**
 *
 *
 * <pre>
 * Request for the `CreateMonitoredProject` method.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest}
 */
public final class CreateMonitoredProjectRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest)
    CreateMonitoredProjectRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateMonitoredProjectRequest.newBuilder() to construct.
  private CreateMonitoredProjectRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateMonitoredProjectRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateMonitoredProjectRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.metricsscope.v1.MetricsScopesProto
        .internal_static_google_monitoring_metricsscope_v1_CreateMonitoredProjectRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.metricsscope.v1.MetricsScopesProto
        .internal_static_google_monitoring_metricsscope_v1_CreateMonitoredProjectRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest.class,
            com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the existing `Metrics Scope` that will monitor this
   * project.
   * Example:
   * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
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
   * Required. The resource name of the existing `Metrics Scope` that will monitor this
   * project.
   * Example:
   * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
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

  public static final int MONITORED_PROJECT_FIELD_NUMBER = 2;
  private com.google.monitoring.metricsscope.v1.MonitoredProject monitoredProject_;
  /**
   *
   *
   * <pre>
   * Required. The initial `MonitoredProject` configuration.
   * Specify only the `monitored_project.name` field. All other fields are
   * ignored. The `monitored_project.name` must be in the format:
   * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}/projects/{MONITORED_PROJECT_ID_OR_NUMBER}`
   * </pre>
   *
   * <code>
   * .google.monitoring.metricsscope.v1.MonitoredProject monitored_project = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the monitoredProject field is set.
   */
  @java.lang.Override
  public boolean hasMonitoredProject() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The initial `MonitoredProject` configuration.
   * Specify only the `monitored_project.name` field. All other fields are
   * ignored. The `monitored_project.name` must be in the format:
   * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}/projects/{MONITORED_PROJECT_ID_OR_NUMBER}`
   * </pre>
   *
   * <code>
   * .google.monitoring.metricsscope.v1.MonitoredProject monitored_project = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The monitoredProject.
   */
  @java.lang.Override
  public com.google.monitoring.metricsscope.v1.MonitoredProject getMonitoredProject() {
    return monitoredProject_ == null
        ? com.google.monitoring.metricsscope.v1.MonitoredProject.getDefaultInstance()
        : monitoredProject_;
  }
  /**
   *
   *
   * <pre>
   * Required. The initial `MonitoredProject` configuration.
   * Specify only the `monitored_project.name` field. All other fields are
   * ignored. The `monitored_project.name` must be in the format:
   * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}/projects/{MONITORED_PROJECT_ID_OR_NUMBER}`
   * </pre>
   *
   * <code>
   * .google.monitoring.metricsscope.v1.MonitoredProject monitored_project = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.monitoring.metricsscope.v1.MonitoredProjectOrBuilder
      getMonitoredProjectOrBuilder() {
    return monitoredProject_ == null
        ? com.google.monitoring.metricsscope.v1.MonitoredProject.getDefaultInstance()
        : monitoredProject_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getMonitoredProject());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getMonitoredProject());
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
    if (!(obj instanceof com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest)) {
      return super.equals(obj);
    }
    com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest other =
        (com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasMonitoredProject() != other.hasMonitoredProject()) return false;
    if (hasMonitoredProject()) {
      if (!getMonitoredProject().equals(other.getMonitoredProject())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasMonitoredProject()) {
      hash = (37 * hash) + MONITORED_PROJECT_FIELD_NUMBER;
      hash = (53 * hash) + getMonitoredProject().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest parseFrom(
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
      com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest prototype) {
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
   * Request for the `CreateMonitoredProject` method.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest)
      com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.metricsscope.v1.MetricsScopesProto
          .internal_static_google_monitoring_metricsscope_v1_CreateMonitoredProjectRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.metricsscope.v1.MetricsScopesProto
          .internal_static_google_monitoring_metricsscope_v1_CreateMonitoredProjectRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest.class,
              com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest.Builder.class);
    }

    // Construct using
    // com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getMonitoredProjectFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      monitoredProject_ = null;
      if (monitoredProjectBuilder_ != null) {
        monitoredProjectBuilder_.dispose();
        monitoredProjectBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.metricsscope.v1.MetricsScopesProto
          .internal_static_google_monitoring_metricsscope_v1_CreateMonitoredProjectRequest_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest
        getDefaultInstanceForType() {
      return com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest build() {
      com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest buildPartial() {
      com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest result =
          new com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.monitoredProject_ =
            monitoredProjectBuilder_ == null ? monitoredProject_ : monitoredProjectBuilder_.build();
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
      if (other instanceof com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest) {
        return mergeFrom(
            (com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest other) {
      if (other
          == com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasMonitoredProject()) {
        mergeMonitoredProject(other.getMonitoredProject());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getMonitoredProjectFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the existing `Metrics Scope` that will monitor this
     * project.
     * Example:
     * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}`
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
     * Required. The resource name of the existing `Metrics Scope` that will monitor this
     * project.
     * Example:
     * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}`
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
     * Required. The resource name of the existing `Metrics Scope` that will monitor this
     * project.
     * Example:
     * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}`
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the existing `Metrics Scope` that will monitor this
     * project.
     * Example:
     * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}`
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
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the existing `Metrics Scope` that will monitor this
     * project.
     * Example:
     * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}`
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.monitoring.metricsscope.v1.MonitoredProject monitoredProject_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.metricsscope.v1.MonitoredProject,
            com.google.monitoring.metricsscope.v1.MonitoredProject.Builder,
            com.google.monitoring.metricsscope.v1.MonitoredProjectOrBuilder>
        monitoredProjectBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The initial `MonitoredProject` configuration.
     * Specify only the `monitored_project.name` field. All other fields are
     * ignored. The `monitored_project.name` must be in the format:
     * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}/projects/{MONITORED_PROJECT_ID_OR_NUMBER}`
     * </pre>
     *
     * <code>
     * .google.monitoring.metricsscope.v1.MonitoredProject monitored_project = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the monitoredProject field is set.
     */
    public boolean hasMonitoredProject() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The initial `MonitoredProject` configuration.
     * Specify only the `monitored_project.name` field. All other fields are
     * ignored. The `monitored_project.name` must be in the format:
     * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}/projects/{MONITORED_PROJECT_ID_OR_NUMBER}`
     * </pre>
     *
     * <code>
     * .google.monitoring.metricsscope.v1.MonitoredProject monitored_project = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The monitoredProject.
     */
    public com.google.monitoring.metricsscope.v1.MonitoredProject getMonitoredProject() {
      if (monitoredProjectBuilder_ == null) {
        return monitoredProject_ == null
            ? com.google.monitoring.metricsscope.v1.MonitoredProject.getDefaultInstance()
            : monitoredProject_;
      } else {
        return monitoredProjectBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The initial `MonitoredProject` configuration.
     * Specify only the `monitored_project.name` field. All other fields are
     * ignored. The `monitored_project.name` must be in the format:
     * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}/projects/{MONITORED_PROJECT_ID_OR_NUMBER}`
     * </pre>
     *
     * <code>
     * .google.monitoring.metricsscope.v1.MonitoredProject monitored_project = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMonitoredProject(
        com.google.monitoring.metricsscope.v1.MonitoredProject value) {
      if (monitoredProjectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        monitoredProject_ = value;
      } else {
        monitoredProjectBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The initial `MonitoredProject` configuration.
     * Specify only the `monitored_project.name` field. All other fields are
     * ignored. The `monitored_project.name` must be in the format:
     * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}/projects/{MONITORED_PROJECT_ID_OR_NUMBER}`
     * </pre>
     *
     * <code>
     * .google.monitoring.metricsscope.v1.MonitoredProject monitored_project = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMonitoredProject(
        com.google.monitoring.metricsscope.v1.MonitoredProject.Builder builderForValue) {
      if (monitoredProjectBuilder_ == null) {
        monitoredProject_ = builderForValue.build();
      } else {
        monitoredProjectBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The initial `MonitoredProject` configuration.
     * Specify only the `monitored_project.name` field. All other fields are
     * ignored. The `monitored_project.name` must be in the format:
     * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}/projects/{MONITORED_PROJECT_ID_OR_NUMBER}`
     * </pre>
     *
     * <code>
     * .google.monitoring.metricsscope.v1.MonitoredProject monitored_project = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeMonitoredProject(
        com.google.monitoring.metricsscope.v1.MonitoredProject value) {
      if (monitoredProjectBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && monitoredProject_ != null
            && monitoredProject_
                != com.google.monitoring.metricsscope.v1.MonitoredProject.getDefaultInstance()) {
          getMonitoredProjectBuilder().mergeFrom(value);
        } else {
          monitoredProject_ = value;
        }
      } else {
        monitoredProjectBuilder_.mergeFrom(value);
      }
      if (monitoredProject_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The initial `MonitoredProject` configuration.
     * Specify only the `monitored_project.name` field. All other fields are
     * ignored. The `monitored_project.name` must be in the format:
     * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}/projects/{MONITORED_PROJECT_ID_OR_NUMBER}`
     * </pre>
     *
     * <code>
     * .google.monitoring.metricsscope.v1.MonitoredProject monitored_project = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearMonitoredProject() {
      bitField0_ = (bitField0_ & ~0x00000002);
      monitoredProject_ = null;
      if (monitoredProjectBuilder_ != null) {
        monitoredProjectBuilder_.dispose();
        monitoredProjectBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The initial `MonitoredProject` configuration.
     * Specify only the `monitored_project.name` field. All other fields are
     * ignored. The `monitored_project.name` must be in the format:
     * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}/projects/{MONITORED_PROJECT_ID_OR_NUMBER}`
     * </pre>
     *
     * <code>
     * .google.monitoring.metricsscope.v1.MonitoredProject monitored_project = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.monitoring.metricsscope.v1.MonitoredProject.Builder
        getMonitoredProjectBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMonitoredProjectFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The initial `MonitoredProject` configuration.
     * Specify only the `monitored_project.name` field. All other fields are
     * ignored. The `monitored_project.name` must be in the format:
     * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}/projects/{MONITORED_PROJECT_ID_OR_NUMBER}`
     * </pre>
     *
     * <code>
     * .google.monitoring.metricsscope.v1.MonitoredProject monitored_project = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.monitoring.metricsscope.v1.MonitoredProjectOrBuilder
        getMonitoredProjectOrBuilder() {
      if (monitoredProjectBuilder_ != null) {
        return monitoredProjectBuilder_.getMessageOrBuilder();
      } else {
        return monitoredProject_ == null
            ? com.google.monitoring.metricsscope.v1.MonitoredProject.getDefaultInstance()
            : monitoredProject_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The initial `MonitoredProject` configuration.
     * Specify only the `monitored_project.name` field. All other fields are
     * ignored. The `monitored_project.name` must be in the format:
     * `locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER}/projects/{MONITORED_PROJECT_ID_OR_NUMBER}`
     * </pre>
     *
     * <code>
     * .google.monitoring.metricsscope.v1.MonitoredProject monitored_project = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.metricsscope.v1.MonitoredProject,
            com.google.monitoring.metricsscope.v1.MonitoredProject.Builder,
            com.google.monitoring.metricsscope.v1.MonitoredProjectOrBuilder>
        getMonitoredProjectFieldBuilder() {
      if (monitoredProjectBuilder_ == null) {
        monitoredProjectBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.monitoring.metricsscope.v1.MonitoredProject,
                com.google.monitoring.metricsscope.v1.MonitoredProject.Builder,
                com.google.monitoring.metricsscope.v1.MonitoredProjectOrBuilder>(
                getMonitoredProject(), getParentForChildren(), isClean());
        monitoredProject_ = null;
      }
      return monitoredProjectBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest)
  private static final com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest();
  }

  public static com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateMonitoredProjectRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateMonitoredProjectRequest>() {
        @java.lang.Override
        public CreateMonitoredProjectRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateMonitoredProjectRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateMonitoredProjectRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.metricsscope.v1.CreateMonitoredProjectRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
