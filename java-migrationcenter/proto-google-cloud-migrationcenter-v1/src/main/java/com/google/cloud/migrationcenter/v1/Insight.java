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
 * An insight about an asset.
 * </pre>
 *
 * Protobuf type {@code google.cloud.migrationcenter.v1.Insight}
 */
public final class Insight extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.migrationcenter.v1.Insight)
    InsightOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Insight.newBuilder() to construct.
  private Insight(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Insight() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Insight();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto
        .internal_static_google_cloud_migrationcenter_v1_Insight_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto
        .internal_static_google_cloud_migrationcenter_v1_Insight_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.migrationcenter.v1.Insight.class,
            com.google.cloud.migrationcenter.v1.Insight.Builder.class);
  }

  private int insightCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object insight_;

  public enum InsightCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    MIGRATION_INSIGHT(1),
    GENERIC_INSIGHT(2),
    INSIGHT_NOT_SET(0);
    private final int value;

    private InsightCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static InsightCase valueOf(int value) {
      return forNumber(value);
    }

    public static InsightCase forNumber(int value) {
      switch (value) {
        case 1:
          return MIGRATION_INSIGHT;
        case 2:
          return GENERIC_INSIGHT;
        case 0:
          return INSIGHT_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public InsightCase getInsightCase() {
    return InsightCase.forNumber(insightCase_);
  }

  public static final int MIGRATION_INSIGHT_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Output only. An insight about potential migrations for an asset.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.MigrationInsight migration_insight = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the migrationInsight field is set.
   */
  @java.lang.Override
  public boolean hasMigrationInsight() {
    return insightCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Output only. An insight about potential migrations for an asset.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.MigrationInsight migration_insight = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The migrationInsight.
   */
  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.MigrationInsight getMigrationInsight() {
    if (insightCase_ == 1) {
      return (com.google.cloud.migrationcenter.v1.MigrationInsight) insight_;
    }
    return com.google.cloud.migrationcenter.v1.MigrationInsight.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Output only. An insight about potential migrations for an asset.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.MigrationInsight migration_insight = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.MigrationInsightOrBuilder
      getMigrationInsightOrBuilder() {
    if (insightCase_ == 1) {
      return (com.google.cloud.migrationcenter.v1.MigrationInsight) insight_;
    }
    return com.google.cloud.migrationcenter.v1.MigrationInsight.getDefaultInstance();
  }

  public static final int GENERIC_INSIGHT_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Output only. A generic insight about an asset
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.GenericInsight generic_insight = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the genericInsight field is set.
   */
  @java.lang.Override
  public boolean hasGenericInsight() {
    return insightCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Output only. A generic insight about an asset
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.GenericInsight generic_insight = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The genericInsight.
   */
  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.GenericInsight getGenericInsight() {
    if (insightCase_ == 2) {
      return (com.google.cloud.migrationcenter.v1.GenericInsight) insight_;
    }
    return com.google.cloud.migrationcenter.v1.GenericInsight.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Output only. A generic insight about an asset
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.GenericInsight generic_insight = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.GenericInsightOrBuilder getGenericInsightOrBuilder() {
    if (insightCase_ == 2) {
      return (com.google.cloud.migrationcenter.v1.GenericInsight) insight_;
    }
    return com.google.cloud.migrationcenter.v1.GenericInsight.getDefaultInstance();
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
    if (insightCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.migrationcenter.v1.MigrationInsight) insight_);
    }
    if (insightCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.migrationcenter.v1.GenericInsight) insight_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (insightCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.migrationcenter.v1.MigrationInsight) insight_);
    }
    if (insightCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.migrationcenter.v1.GenericInsight) insight_);
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
    if (!(obj instanceof com.google.cloud.migrationcenter.v1.Insight)) {
      return super.equals(obj);
    }
    com.google.cloud.migrationcenter.v1.Insight other =
        (com.google.cloud.migrationcenter.v1.Insight) obj;

    if (!getInsightCase().equals(other.getInsightCase())) return false;
    switch (insightCase_) {
      case 1:
        if (!getMigrationInsight().equals(other.getMigrationInsight())) return false;
        break;
      case 2:
        if (!getGenericInsight().equals(other.getGenericInsight())) return false;
        break;
      case 0:
      default:
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
    switch (insightCase_) {
      case 1:
        hash = (37 * hash) + MIGRATION_INSIGHT_FIELD_NUMBER;
        hash = (53 * hash) + getMigrationInsight().hashCode();
        break;
      case 2:
        hash = (37 * hash) + GENERIC_INSIGHT_FIELD_NUMBER;
        hash = (53 * hash) + getGenericInsight().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.migrationcenter.v1.Insight parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.Insight parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.Insight parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.Insight parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.Insight parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.Insight parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.Insight parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.Insight parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.Insight parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.Insight parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.Insight parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.Insight parseFrom(
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

  public static Builder newBuilder(com.google.cloud.migrationcenter.v1.Insight prototype) {
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
   * An insight about an asset.
   * </pre>
   *
   * Protobuf type {@code google.cloud.migrationcenter.v1.Insight}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.migrationcenter.v1.Insight)
      com.google.cloud.migrationcenter.v1.InsightOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_Insight_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_Insight_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.migrationcenter.v1.Insight.class,
              com.google.cloud.migrationcenter.v1.Insight.Builder.class);
    }

    // Construct using com.google.cloud.migrationcenter.v1.Insight.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (migrationInsightBuilder_ != null) {
        migrationInsightBuilder_.clear();
      }
      if (genericInsightBuilder_ != null) {
        genericInsightBuilder_.clear();
      }
      insightCase_ = 0;
      insight_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_Insight_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.Insight getDefaultInstanceForType() {
      return com.google.cloud.migrationcenter.v1.Insight.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.Insight build() {
      com.google.cloud.migrationcenter.v1.Insight result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.Insight buildPartial() {
      com.google.cloud.migrationcenter.v1.Insight result =
          new com.google.cloud.migrationcenter.v1.Insight(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.migrationcenter.v1.Insight result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.migrationcenter.v1.Insight result) {
      result.insightCase_ = insightCase_;
      result.insight_ = this.insight_;
      if (insightCase_ == 1 && migrationInsightBuilder_ != null) {
        result.insight_ = migrationInsightBuilder_.build();
      }
      if (insightCase_ == 2 && genericInsightBuilder_ != null) {
        result.insight_ = genericInsightBuilder_.build();
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
      if (other instanceof com.google.cloud.migrationcenter.v1.Insight) {
        return mergeFrom((com.google.cloud.migrationcenter.v1.Insight) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.migrationcenter.v1.Insight other) {
      if (other == com.google.cloud.migrationcenter.v1.Insight.getDefaultInstance()) return this;
      switch (other.getInsightCase()) {
        case MIGRATION_INSIGHT:
          {
            mergeMigrationInsight(other.getMigrationInsight());
            break;
          }
        case GENERIC_INSIGHT:
          {
            mergeGenericInsight(other.getGenericInsight());
            break;
          }
        case INSIGHT_NOT_SET:
          {
            break;
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
                input.readMessage(
                    getMigrationInsightFieldBuilder().getBuilder(), extensionRegistry);
                insightCase_ = 1;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getGenericInsightFieldBuilder().getBuilder(), extensionRegistry);
                insightCase_ = 2;
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

    private int insightCase_ = 0;
    private java.lang.Object insight_;

    public InsightCase getInsightCase() {
      return InsightCase.forNumber(insightCase_);
    }

    public Builder clearInsight() {
      insightCase_ = 0;
      insight_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.migrationcenter.v1.MigrationInsight,
            com.google.cloud.migrationcenter.v1.MigrationInsight.Builder,
            com.google.cloud.migrationcenter.v1.MigrationInsightOrBuilder>
        migrationInsightBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. An insight about potential migrations for an asset.
     * </pre>
     *
     * <code>
     * .google.cloud.migrationcenter.v1.MigrationInsight migration_insight = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the migrationInsight field is set.
     */
    @java.lang.Override
    public boolean hasMigrationInsight() {
      return insightCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Output only. An insight about potential migrations for an asset.
     * </pre>
     *
     * <code>
     * .google.cloud.migrationcenter.v1.MigrationInsight migration_insight = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The migrationInsight.
     */
    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.MigrationInsight getMigrationInsight() {
      if (migrationInsightBuilder_ == null) {
        if (insightCase_ == 1) {
          return (com.google.cloud.migrationcenter.v1.MigrationInsight) insight_;
        }
        return com.google.cloud.migrationcenter.v1.MigrationInsight.getDefaultInstance();
      } else {
        if (insightCase_ == 1) {
          return migrationInsightBuilder_.getMessage();
        }
        return com.google.cloud.migrationcenter.v1.MigrationInsight.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. An insight about potential migrations for an asset.
     * </pre>
     *
     * <code>
     * .google.cloud.migrationcenter.v1.MigrationInsight migration_insight = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setMigrationInsight(com.google.cloud.migrationcenter.v1.MigrationInsight value) {
      if (migrationInsightBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        insight_ = value;
        onChanged();
      } else {
        migrationInsightBuilder_.setMessage(value);
      }
      insightCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. An insight about potential migrations for an asset.
     * </pre>
     *
     * <code>
     * .google.cloud.migrationcenter.v1.MigrationInsight migration_insight = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setMigrationInsight(
        com.google.cloud.migrationcenter.v1.MigrationInsight.Builder builderForValue) {
      if (migrationInsightBuilder_ == null) {
        insight_ = builderForValue.build();
        onChanged();
      } else {
        migrationInsightBuilder_.setMessage(builderForValue.build());
      }
      insightCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. An insight about potential migrations for an asset.
     * </pre>
     *
     * <code>
     * .google.cloud.migrationcenter.v1.MigrationInsight migration_insight = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeMigrationInsight(
        com.google.cloud.migrationcenter.v1.MigrationInsight value) {
      if (migrationInsightBuilder_ == null) {
        if (insightCase_ == 1
            && insight_
                != com.google.cloud.migrationcenter.v1.MigrationInsight.getDefaultInstance()) {
          insight_ =
              com.google.cloud.migrationcenter.v1.MigrationInsight.newBuilder(
                      (com.google.cloud.migrationcenter.v1.MigrationInsight) insight_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          insight_ = value;
        }
        onChanged();
      } else {
        if (insightCase_ == 1) {
          migrationInsightBuilder_.mergeFrom(value);
        } else {
          migrationInsightBuilder_.setMessage(value);
        }
      }
      insightCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. An insight about potential migrations for an asset.
     * </pre>
     *
     * <code>
     * .google.cloud.migrationcenter.v1.MigrationInsight migration_insight = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearMigrationInsight() {
      if (migrationInsightBuilder_ == null) {
        if (insightCase_ == 1) {
          insightCase_ = 0;
          insight_ = null;
          onChanged();
        }
      } else {
        if (insightCase_ == 1) {
          insightCase_ = 0;
          insight_ = null;
        }
        migrationInsightBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. An insight about potential migrations for an asset.
     * </pre>
     *
     * <code>
     * .google.cloud.migrationcenter.v1.MigrationInsight migration_insight = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.migrationcenter.v1.MigrationInsight.Builder
        getMigrationInsightBuilder() {
      return getMigrationInsightFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. An insight about potential migrations for an asset.
     * </pre>
     *
     * <code>
     * .google.cloud.migrationcenter.v1.MigrationInsight migration_insight = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.MigrationInsightOrBuilder
        getMigrationInsightOrBuilder() {
      if ((insightCase_ == 1) && (migrationInsightBuilder_ != null)) {
        return migrationInsightBuilder_.getMessageOrBuilder();
      } else {
        if (insightCase_ == 1) {
          return (com.google.cloud.migrationcenter.v1.MigrationInsight) insight_;
        }
        return com.google.cloud.migrationcenter.v1.MigrationInsight.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. An insight about potential migrations for an asset.
     * </pre>
     *
     * <code>
     * .google.cloud.migrationcenter.v1.MigrationInsight migration_insight = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.migrationcenter.v1.MigrationInsight,
            com.google.cloud.migrationcenter.v1.MigrationInsight.Builder,
            com.google.cloud.migrationcenter.v1.MigrationInsightOrBuilder>
        getMigrationInsightFieldBuilder() {
      if (migrationInsightBuilder_ == null) {
        if (!(insightCase_ == 1)) {
          insight_ = com.google.cloud.migrationcenter.v1.MigrationInsight.getDefaultInstance();
        }
        migrationInsightBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.migrationcenter.v1.MigrationInsight,
                com.google.cloud.migrationcenter.v1.MigrationInsight.Builder,
                com.google.cloud.migrationcenter.v1.MigrationInsightOrBuilder>(
                (com.google.cloud.migrationcenter.v1.MigrationInsight) insight_,
                getParentForChildren(),
                isClean());
        insight_ = null;
      }
      insightCase_ = 1;
      onChanged();
      return migrationInsightBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.migrationcenter.v1.GenericInsight,
            com.google.cloud.migrationcenter.v1.GenericInsight.Builder,
            com.google.cloud.migrationcenter.v1.GenericInsightOrBuilder>
        genericInsightBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. A generic insight about an asset
     * </pre>
     *
     * <code>
     * .google.cloud.migrationcenter.v1.GenericInsight generic_insight = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the genericInsight field is set.
     */
    @java.lang.Override
    public boolean hasGenericInsight() {
      return insightCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Output only. A generic insight about an asset
     * </pre>
     *
     * <code>
     * .google.cloud.migrationcenter.v1.GenericInsight generic_insight = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The genericInsight.
     */
    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.GenericInsight getGenericInsight() {
      if (genericInsightBuilder_ == null) {
        if (insightCase_ == 2) {
          return (com.google.cloud.migrationcenter.v1.GenericInsight) insight_;
        }
        return com.google.cloud.migrationcenter.v1.GenericInsight.getDefaultInstance();
      } else {
        if (insightCase_ == 2) {
          return genericInsightBuilder_.getMessage();
        }
        return com.google.cloud.migrationcenter.v1.GenericInsight.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. A generic insight about an asset
     * </pre>
     *
     * <code>
     * .google.cloud.migrationcenter.v1.GenericInsight generic_insight = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setGenericInsight(com.google.cloud.migrationcenter.v1.GenericInsight value) {
      if (genericInsightBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        insight_ = value;
        onChanged();
      } else {
        genericInsightBuilder_.setMessage(value);
      }
      insightCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. A generic insight about an asset
     * </pre>
     *
     * <code>
     * .google.cloud.migrationcenter.v1.GenericInsight generic_insight = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setGenericInsight(
        com.google.cloud.migrationcenter.v1.GenericInsight.Builder builderForValue) {
      if (genericInsightBuilder_ == null) {
        insight_ = builderForValue.build();
        onChanged();
      } else {
        genericInsightBuilder_.setMessage(builderForValue.build());
      }
      insightCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. A generic insight about an asset
     * </pre>
     *
     * <code>
     * .google.cloud.migrationcenter.v1.GenericInsight generic_insight = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeGenericInsight(com.google.cloud.migrationcenter.v1.GenericInsight value) {
      if (genericInsightBuilder_ == null) {
        if (insightCase_ == 2
            && insight_
                != com.google.cloud.migrationcenter.v1.GenericInsight.getDefaultInstance()) {
          insight_ =
              com.google.cloud.migrationcenter.v1.GenericInsight.newBuilder(
                      (com.google.cloud.migrationcenter.v1.GenericInsight) insight_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          insight_ = value;
        }
        onChanged();
      } else {
        if (insightCase_ == 2) {
          genericInsightBuilder_.mergeFrom(value);
        } else {
          genericInsightBuilder_.setMessage(value);
        }
      }
      insightCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. A generic insight about an asset
     * </pre>
     *
     * <code>
     * .google.cloud.migrationcenter.v1.GenericInsight generic_insight = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearGenericInsight() {
      if (genericInsightBuilder_ == null) {
        if (insightCase_ == 2) {
          insightCase_ = 0;
          insight_ = null;
          onChanged();
        }
      } else {
        if (insightCase_ == 2) {
          insightCase_ = 0;
          insight_ = null;
        }
        genericInsightBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. A generic insight about an asset
     * </pre>
     *
     * <code>
     * .google.cloud.migrationcenter.v1.GenericInsight generic_insight = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.migrationcenter.v1.GenericInsight.Builder getGenericInsightBuilder() {
      return getGenericInsightFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. A generic insight about an asset
     * </pre>
     *
     * <code>
     * .google.cloud.migrationcenter.v1.GenericInsight generic_insight = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.GenericInsightOrBuilder
        getGenericInsightOrBuilder() {
      if ((insightCase_ == 2) && (genericInsightBuilder_ != null)) {
        return genericInsightBuilder_.getMessageOrBuilder();
      } else {
        if (insightCase_ == 2) {
          return (com.google.cloud.migrationcenter.v1.GenericInsight) insight_;
        }
        return com.google.cloud.migrationcenter.v1.GenericInsight.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. A generic insight about an asset
     * </pre>
     *
     * <code>
     * .google.cloud.migrationcenter.v1.GenericInsight generic_insight = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.migrationcenter.v1.GenericInsight,
            com.google.cloud.migrationcenter.v1.GenericInsight.Builder,
            com.google.cloud.migrationcenter.v1.GenericInsightOrBuilder>
        getGenericInsightFieldBuilder() {
      if (genericInsightBuilder_ == null) {
        if (!(insightCase_ == 2)) {
          insight_ = com.google.cloud.migrationcenter.v1.GenericInsight.getDefaultInstance();
        }
        genericInsightBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.migrationcenter.v1.GenericInsight,
                com.google.cloud.migrationcenter.v1.GenericInsight.Builder,
                com.google.cloud.migrationcenter.v1.GenericInsightOrBuilder>(
                (com.google.cloud.migrationcenter.v1.GenericInsight) insight_,
                getParentForChildren(),
                isClean());
        insight_ = null;
      }
      insightCase_ = 2;
      onChanged();
      return genericInsightBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.migrationcenter.v1.Insight)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.migrationcenter.v1.Insight)
  private static final com.google.cloud.migrationcenter.v1.Insight DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.migrationcenter.v1.Insight();
  }

  public static com.google.cloud.migrationcenter.v1.Insight getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Insight> PARSER =
      new com.google.protobuf.AbstractParser<Insight>() {
        @java.lang.Override
        public Insight parsePartialFrom(
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

  public static com.google.protobuf.Parser<Insight> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Insight> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.Insight getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
