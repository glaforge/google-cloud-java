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
 * Next actions state the value for a dimension after the user has achieved
 * a step but before the same user has achieved the next step. For example if
 * the `nextActionDimension` is `eventName`, then `nextActionDimension` in the
 * `i`th funnel step row will return first event after the event that qualified
 * the user into the `i`th funnel step but before the user achieved the `i+1`th
 * funnel step.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.FunnelNextAction}
 */
public final class FunnelNextAction extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.FunnelNextAction)
    FunnelNextActionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FunnelNextAction.newBuilder() to construct.
  private FunnelNextAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FunnelNextAction() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FunnelNextAction();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_FunnelNextAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_FunnelNextAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.FunnelNextAction.class,
            com.google.analytics.data.v1alpha.FunnelNextAction.Builder.class);
  }

  private int bitField0_;
  public static final int NEXT_ACTION_DIMENSION_FIELD_NUMBER = 1;
  private com.google.analytics.data.v1alpha.Dimension nextActionDimension_;
  /**
   *
   *
   * <pre>
   * The dimension column added to the funnel visualization sub report response.
   * The next action dimension returns the next dimension value of this
   * dimension after the user has attained the `i`th funnel step.
   *
   * `nextActionDimension` currently only supports `eventName` and most Page /
   * Screen dimensions like `pageTitle` and `pagePath`. `nextActionDimension`
   * cannot be a dimension expression.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Dimension next_action_dimension = 1;</code>
   *
   * @return Whether the nextActionDimension field is set.
   */
  @java.lang.Override
  public boolean hasNextActionDimension() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The dimension column added to the funnel visualization sub report response.
   * The next action dimension returns the next dimension value of this
   * dimension after the user has attained the `i`th funnel step.
   *
   * `nextActionDimension` currently only supports `eventName` and most Page /
   * Screen dimensions like `pageTitle` and `pagePath`. `nextActionDimension`
   * cannot be a dimension expression.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Dimension next_action_dimension = 1;</code>
   *
   * @return The nextActionDimension.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.Dimension getNextActionDimension() {
    return nextActionDimension_ == null
        ? com.google.analytics.data.v1alpha.Dimension.getDefaultInstance()
        : nextActionDimension_;
  }
  /**
   *
   *
   * <pre>
   * The dimension column added to the funnel visualization sub report response.
   * The next action dimension returns the next dimension value of this
   * dimension after the user has attained the `i`th funnel step.
   *
   * `nextActionDimension` currently only supports `eventName` and most Page /
   * Screen dimensions like `pageTitle` and `pagePath`. `nextActionDimension`
   * cannot be a dimension expression.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Dimension next_action_dimension = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.DimensionOrBuilder getNextActionDimensionOrBuilder() {
    return nextActionDimension_ == null
        ? com.google.analytics.data.v1alpha.Dimension.getDefaultInstance()
        : nextActionDimension_;
  }

  public static final int LIMIT_FIELD_NUMBER = 2;
  private long limit_ = 0L;
  /**
   *
   *
   * <pre>
   * The maximum number of distinct values of the breakdown dimension to return
   * in the response. A `limit` of `5` is used if limit is not specified. Limit
   * must exceed zero and cannot exceed 5.
   * </pre>
   *
   * <code>optional int64 limit = 2;</code>
   *
   * @return Whether the limit field is set.
   */
  @java.lang.Override
  public boolean hasLimit() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The maximum number of distinct values of the breakdown dimension to return
   * in the response. A `limit` of `5` is used if limit is not specified. Limit
   * must exceed zero and cannot exceed 5.
   * </pre>
   *
   * <code>optional int64 limit = 2;</code>
   *
   * @return The limit.
   */
  @java.lang.Override
  public long getLimit() {
    return limit_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getNextActionDimension());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(2, limit_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getNextActionDimension());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, limit_);
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.FunnelNextAction)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.FunnelNextAction other =
        (com.google.analytics.data.v1alpha.FunnelNextAction) obj;

    if (hasNextActionDimension() != other.hasNextActionDimension()) return false;
    if (hasNextActionDimension()) {
      if (!getNextActionDimension().equals(other.getNextActionDimension())) return false;
    }
    if (hasLimit() != other.hasLimit()) return false;
    if (hasLimit()) {
      if (getLimit() != other.getLimit()) return false;
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
    if (hasNextActionDimension()) {
      hash = (37 * hash) + NEXT_ACTION_DIMENSION_FIELD_NUMBER;
      hash = (53 * hash) + getNextActionDimension().hashCode();
    }
    if (hasLimit()) {
      hash = (37 * hash) + LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getLimit());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.FunnelNextAction parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.FunnelNextAction parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.FunnelNextAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.FunnelNextAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.FunnelNextAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.FunnelNextAction parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.FunnelNextAction parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.FunnelNextAction parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.FunnelNextAction parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.FunnelNextAction parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.FunnelNextAction parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.FunnelNextAction parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.FunnelNextAction prototype) {
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
   * Next actions state the value for a dimension after the user has achieved
   * a step but before the same user has achieved the next step. For example if
   * the `nextActionDimension` is `eventName`, then `nextActionDimension` in the
   * `i`th funnel step row will return first event after the event that qualified
   * the user into the `i`th funnel step but before the user achieved the `i+1`th
   * funnel step.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.FunnelNextAction}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.FunnelNextAction)
      com.google.analytics.data.v1alpha.FunnelNextActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_FunnelNextAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_FunnelNextAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.FunnelNextAction.class,
              com.google.analytics.data.v1alpha.FunnelNextAction.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.FunnelNextAction.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getNextActionDimensionFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      nextActionDimension_ = null;
      if (nextActionDimensionBuilder_ != null) {
        nextActionDimensionBuilder_.dispose();
        nextActionDimensionBuilder_ = null;
      }
      limit_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_FunnelNextAction_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.FunnelNextAction getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.FunnelNextAction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.FunnelNextAction build() {
      com.google.analytics.data.v1alpha.FunnelNextAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.FunnelNextAction buildPartial() {
      com.google.analytics.data.v1alpha.FunnelNextAction result =
          new com.google.analytics.data.v1alpha.FunnelNextAction(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.data.v1alpha.FunnelNextAction result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nextActionDimension_ =
            nextActionDimensionBuilder_ == null
                ? nextActionDimension_
                : nextActionDimensionBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.limit_ = limit_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.analytics.data.v1alpha.FunnelNextAction) {
        return mergeFrom((com.google.analytics.data.v1alpha.FunnelNextAction) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.FunnelNextAction other) {
      if (other == com.google.analytics.data.v1alpha.FunnelNextAction.getDefaultInstance())
        return this;
      if (other.hasNextActionDimension()) {
        mergeNextActionDimension(other.getNextActionDimension());
      }
      if (other.hasLimit()) {
        setLimit(other.getLimit());
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
                input.readMessage(
                    getNextActionDimensionFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                limit_ = input.readInt64();
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

    private com.google.analytics.data.v1alpha.Dimension nextActionDimension_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.Dimension,
            com.google.analytics.data.v1alpha.Dimension.Builder,
            com.google.analytics.data.v1alpha.DimensionOrBuilder>
        nextActionDimensionBuilder_;
    /**
     *
     *
     * <pre>
     * The dimension column added to the funnel visualization sub report response.
     * The next action dimension returns the next dimension value of this
     * dimension after the user has attained the `i`th funnel step.
     *
     * `nextActionDimension` currently only supports `eventName` and most Page /
     * Screen dimensions like `pageTitle` and `pagePath`. `nextActionDimension`
     * cannot be a dimension expression.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Dimension next_action_dimension = 1;</code>
     *
     * @return Whether the nextActionDimension field is set.
     */
    public boolean hasNextActionDimension() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The dimension column added to the funnel visualization sub report response.
     * The next action dimension returns the next dimension value of this
     * dimension after the user has attained the `i`th funnel step.
     *
     * `nextActionDimension` currently only supports `eventName` and most Page /
     * Screen dimensions like `pageTitle` and `pagePath`. `nextActionDimension`
     * cannot be a dimension expression.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Dimension next_action_dimension = 1;</code>
     *
     * @return The nextActionDimension.
     */
    public com.google.analytics.data.v1alpha.Dimension getNextActionDimension() {
      if (nextActionDimensionBuilder_ == null) {
        return nextActionDimension_ == null
            ? com.google.analytics.data.v1alpha.Dimension.getDefaultInstance()
            : nextActionDimension_;
      } else {
        return nextActionDimensionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The dimension column added to the funnel visualization sub report response.
     * The next action dimension returns the next dimension value of this
     * dimension after the user has attained the `i`th funnel step.
     *
     * `nextActionDimension` currently only supports `eventName` and most Page /
     * Screen dimensions like `pageTitle` and `pagePath`. `nextActionDimension`
     * cannot be a dimension expression.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Dimension next_action_dimension = 1;</code>
     */
    public Builder setNextActionDimension(com.google.analytics.data.v1alpha.Dimension value) {
      if (nextActionDimensionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nextActionDimension_ = value;
      } else {
        nextActionDimensionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The dimension column added to the funnel visualization sub report response.
     * The next action dimension returns the next dimension value of this
     * dimension after the user has attained the `i`th funnel step.
     *
     * `nextActionDimension` currently only supports `eventName` and most Page /
     * Screen dimensions like `pageTitle` and `pagePath`. `nextActionDimension`
     * cannot be a dimension expression.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Dimension next_action_dimension = 1;</code>
     */
    public Builder setNextActionDimension(
        com.google.analytics.data.v1alpha.Dimension.Builder builderForValue) {
      if (nextActionDimensionBuilder_ == null) {
        nextActionDimension_ = builderForValue.build();
      } else {
        nextActionDimensionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The dimension column added to the funnel visualization sub report response.
     * The next action dimension returns the next dimension value of this
     * dimension after the user has attained the `i`th funnel step.
     *
     * `nextActionDimension` currently only supports `eventName` and most Page /
     * Screen dimensions like `pageTitle` and `pagePath`. `nextActionDimension`
     * cannot be a dimension expression.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Dimension next_action_dimension = 1;</code>
     */
    public Builder mergeNextActionDimension(com.google.analytics.data.v1alpha.Dimension value) {
      if (nextActionDimensionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && nextActionDimension_ != null
            && nextActionDimension_
                != com.google.analytics.data.v1alpha.Dimension.getDefaultInstance()) {
          getNextActionDimensionBuilder().mergeFrom(value);
        } else {
          nextActionDimension_ = value;
        }
      } else {
        nextActionDimensionBuilder_.mergeFrom(value);
      }
      if (nextActionDimension_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The dimension column added to the funnel visualization sub report response.
     * The next action dimension returns the next dimension value of this
     * dimension after the user has attained the `i`th funnel step.
     *
     * `nextActionDimension` currently only supports `eventName` and most Page /
     * Screen dimensions like `pageTitle` and `pagePath`. `nextActionDimension`
     * cannot be a dimension expression.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Dimension next_action_dimension = 1;</code>
     */
    public Builder clearNextActionDimension() {
      bitField0_ = (bitField0_ & ~0x00000001);
      nextActionDimension_ = null;
      if (nextActionDimensionBuilder_ != null) {
        nextActionDimensionBuilder_.dispose();
        nextActionDimensionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The dimension column added to the funnel visualization sub report response.
     * The next action dimension returns the next dimension value of this
     * dimension after the user has attained the `i`th funnel step.
     *
     * `nextActionDimension` currently only supports `eventName` and most Page /
     * Screen dimensions like `pageTitle` and `pagePath`. `nextActionDimension`
     * cannot be a dimension expression.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Dimension next_action_dimension = 1;</code>
     */
    public com.google.analytics.data.v1alpha.Dimension.Builder getNextActionDimensionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getNextActionDimensionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The dimension column added to the funnel visualization sub report response.
     * The next action dimension returns the next dimension value of this
     * dimension after the user has attained the `i`th funnel step.
     *
     * `nextActionDimension` currently only supports `eventName` and most Page /
     * Screen dimensions like `pageTitle` and `pagePath`. `nextActionDimension`
     * cannot be a dimension expression.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Dimension next_action_dimension = 1;</code>
     */
    public com.google.analytics.data.v1alpha.DimensionOrBuilder getNextActionDimensionOrBuilder() {
      if (nextActionDimensionBuilder_ != null) {
        return nextActionDimensionBuilder_.getMessageOrBuilder();
      } else {
        return nextActionDimension_ == null
            ? com.google.analytics.data.v1alpha.Dimension.getDefaultInstance()
            : nextActionDimension_;
      }
    }
    /**
     *
     *
     * <pre>
     * The dimension column added to the funnel visualization sub report response.
     * The next action dimension returns the next dimension value of this
     * dimension after the user has attained the `i`th funnel step.
     *
     * `nextActionDimension` currently only supports `eventName` and most Page /
     * Screen dimensions like `pageTitle` and `pagePath`. `nextActionDimension`
     * cannot be a dimension expression.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.Dimension next_action_dimension = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.Dimension,
            com.google.analytics.data.v1alpha.Dimension.Builder,
            com.google.analytics.data.v1alpha.DimensionOrBuilder>
        getNextActionDimensionFieldBuilder() {
      if (nextActionDimensionBuilder_ == null) {
        nextActionDimensionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.Dimension,
                com.google.analytics.data.v1alpha.Dimension.Builder,
                com.google.analytics.data.v1alpha.DimensionOrBuilder>(
                getNextActionDimension(), getParentForChildren(), isClean());
        nextActionDimension_ = null;
      }
      return nextActionDimensionBuilder_;
    }

    private long limit_;
    /**
     *
     *
     * <pre>
     * The maximum number of distinct values of the breakdown dimension to return
     * in the response. A `limit` of `5` is used if limit is not specified. Limit
     * must exceed zero and cannot exceed 5.
     * </pre>
     *
     * <code>optional int64 limit = 2;</code>
     *
     * @return Whether the limit field is set.
     */
    @java.lang.Override
    public boolean hasLimit() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The maximum number of distinct values of the breakdown dimension to return
     * in the response. A `limit` of `5` is used if limit is not specified. Limit
     * must exceed zero and cannot exceed 5.
     * </pre>
     *
     * <code>optional int64 limit = 2;</code>
     *
     * @return The limit.
     */
    @java.lang.Override
    public long getLimit() {
      return limit_;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of distinct values of the breakdown dimension to return
     * in the response. A `limit` of `5` is used if limit is not specified. Limit
     * must exceed zero and cannot exceed 5.
     * </pre>
     *
     * <code>optional int64 limit = 2;</code>
     *
     * @param value The limit to set.
     * @return This builder for chaining.
     */
    public Builder setLimit(long value) {

      limit_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of distinct values of the breakdown dimension to return
     * in the response. A `limit` of `5` is used if limit is not specified. Limit
     * must exceed zero and cannot exceed 5.
     * </pre>
     *
     * <code>optional int64 limit = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLimit() {
      bitField0_ = (bitField0_ & ~0x00000002);
      limit_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.FunnelNextAction)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.FunnelNextAction)
  private static final com.google.analytics.data.v1alpha.FunnelNextAction DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.FunnelNextAction();
  }

  public static com.google.analytics.data.v1alpha.FunnelNextAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FunnelNextAction> PARSER =
      new com.google.protobuf.AbstractParser<FunnelNextAction>() {
        @java.lang.Override
        public FunnelNextAction parsePartialFrom(
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

  public static com.google.protobuf.Parser<FunnelNextAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FunnelNextAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.FunnelNextAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
