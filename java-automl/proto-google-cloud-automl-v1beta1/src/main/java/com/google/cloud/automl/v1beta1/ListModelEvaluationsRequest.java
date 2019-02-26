// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/service.proto

package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for
 * [AutoMl.ListModelEvaluations][google.cloud.automl.v1beta1.AutoMl.ListModelEvaluations].
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.ListModelEvaluationsRequest}
 */
public final class ListModelEvaluationsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.ListModelEvaluationsRequest)
    ListModelEvaluationsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListModelEvaluationsRequest.newBuilder() to construct.
  private ListModelEvaluationsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListModelEvaluationsRequest() {
    parent_ = "";
    filter_ = "";
    pageSize_ = 0;
    pageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListModelEvaluationsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              filter_ = s;
              break;
            }
          case 32:
            {
              pageSize_ = input.readInt32();
              break;
            }
          case 50:
            {
              java.lang.String s = input.readStringRequireUtf8();

              pageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
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
    return com.google.cloud.automl.v1beta1.AutoMlProto
        .internal_static_google_cloud_automl_v1beta1_ListModelEvaluationsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.AutoMlProto
        .internal_static_google_cloud_automl_v1beta1_ListModelEvaluationsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest.class,
            com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Resource name of the model to list the model evaluations for.
   * If modelId is set as "-", this will list model evaluations from across all
   * models of the parent location.
   * </pre>
   *
   * <code>string parent = 1;</code>
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
   * Resource name of the model to list the model evaluations for.
   * If modelId is set as "-", this will list model evaluations from across all
   * models of the parent location.
   * </pre>
   *
   * <code>string parent = 1;</code>
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

  public static final int FILTER_FIELD_NUMBER = 3;
  private volatile java.lang.Object filter_;
  /**
   *
   *
   * <pre>
   * An expression for filtering the results of the request.
   *   * `annotation_spec_id` - for =, !=  or existence. See example below for
   *                          the last.
   * Some examples of using the filter are:
   *   * `annotation_spec_id!=4` --&gt; The model evaluation was done for
   *                             annotation spec with ID different than 4.
   *   * `NOT annotation_spec_id:*` --&gt; The model evaluation was done for
   *                                aggregate of all annotation specs.
   * </pre>
   *
   * <code>string filter = 3;</code>
   */
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * An expression for filtering the results of the request.
   *   * `annotation_spec_id` - for =, !=  or existence. See example below for
   *                          the last.
   * Some examples of using the filter are:
   *   * `annotation_spec_id!=4` --&gt; The model evaluation was done for
   *                             annotation spec with ID different than 4.
   *   * `NOT annotation_spec_id:*` --&gt; The model evaluation was done for
   *                                aggregate of all annotation specs.
   * </pre>
   *
   * <code>string filter = 3;</code>
   */
  public com.google.protobuf.ByteString getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      filter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 4;
  private int pageSize_;
  /**
   *
   *
   * <pre>
   * Requested page size.
   * </pre>
   *
   * <code>int32 page_size = 4;</code>
   */
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 6;
  private volatile java.lang.Object pageToken_;
  /**
   *
   *
   * <pre>
   * A token identifying a page of results for the server to return.
   * Typically obtained via
   * `ListModelEvaluationsResponse.next_page_token` of the previous
   * [AutoMl.ListModelEvaluations][google.cloud.automl.v1beta1.AutoMl.ListModelEvaluations]
   * call.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   */
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token identifying a page of results for the server to return.
   * Typically obtained via
   * `ListModelEvaluationsResponse.next_page_token` of the previous
   * [AutoMl.ListModelEvaluations][google.cloud.automl.v1beta1.AutoMl.ListModelEvaluations]
   * call.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   */
  public com.google.protobuf.ByteString getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      pageToken_ = b;
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!getFilterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, filter_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(4, pageSize_);
    }
    if (!getPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, pageToken_);
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
    if (!getFilterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, filter_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, pageSize_);
    }
    if (!getPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, pageToken_);
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest other =
        (com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest) obj;

    boolean result = true;
    result = result && getParent().equals(other.getParent());
    result = result && getFilter().equals(other.getFilter());
    result = result && (getPageSize() == other.getPageSize());
    result = result && getPageToken().equals(other.getPageToken());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
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
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getFilter().hashCode();
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest parseFrom(
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
      com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest prototype) {
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
   * Request message for
   * [AutoMl.ListModelEvaluations][google.cloud.automl.v1beta1.AutoMl.ListModelEvaluations].
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.ListModelEvaluationsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.ListModelEvaluationsRequest)
      com.google.cloud.automl.v1beta1.ListModelEvaluationsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.AutoMlProto
          .internal_static_google_cloud_automl_v1beta1_ListModelEvaluationsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.AutoMlProto
          .internal_static_google_cloud_automl_v1beta1_ListModelEvaluationsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest.class,
              com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest.newBuilder()
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

      filter_ = "";

      pageSize_ = 0;

      pageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.AutoMlProto
          .internal_static_google_cloud_automl_v1beta1_ListModelEvaluationsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest build() {
      com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest buildPartial() {
      com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest result =
          new com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest(this);
      result.parent_ = parent_;
      result.filter_ = filter_;
      result.pageSize_ = pageSize_;
      result.pageToken_ = pageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest) {
        return mergeFrom((com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest other) {
      if (other == com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
        onChanged();
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        onChanged();
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
      com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest) e.getUnfinishedMessage();
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
     * Resource name of the model to list the model evaluations for.
     * If modelId is set as "-", this will list model evaluations from across all
     * models of the parent location.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * Resource name of the model to list the model evaluations for.
     * If modelId is set as "-", this will list model evaluations from across all
     * models of the parent location.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * Resource name of the model to list the model evaluations for.
     * If modelId is set as "-", this will list model evaluations from across all
     * models of the parent location.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * Resource name of the model to list the model evaluations for.
     * If modelId is set as "-", this will list model evaluations from across all
     * models of the parent location.
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * Resource name of the model to list the model evaluations for.
     * If modelId is set as "-", this will list model evaluations from across all
     * models of the parent location.
     * </pre>
     *
     * <code>string parent = 1;</code>
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

    private java.lang.Object filter_ = "";
    /**
     *
     *
     * <pre>
     * An expression for filtering the results of the request.
     *   * `annotation_spec_id` - for =, !=  or existence. See example below for
     *                          the last.
     * Some examples of using the filter are:
     *   * `annotation_spec_id!=4` --&gt; The model evaluation was done for
     *                             annotation spec with ID different than 4.
     *   * `NOT annotation_spec_id:*` --&gt; The model evaluation was done for
     *                                aggregate of all annotation specs.
     * </pre>
     *
     * <code>string filter = 3;</code>
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * An expression for filtering the results of the request.
     *   * `annotation_spec_id` - for =, !=  or existence. See example below for
     *                          the last.
     * Some examples of using the filter are:
     *   * `annotation_spec_id!=4` --&gt; The model evaluation was done for
     *                             annotation spec with ID different than 4.
     *   * `NOT annotation_spec_id:*` --&gt; The model evaluation was done for
     *                                aggregate of all annotation specs.
     * </pre>
     *
     * <code>string filter = 3;</code>
     */
    public com.google.protobuf.ByteString getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * An expression for filtering the results of the request.
     *   * `annotation_spec_id` - for =, !=  or existence. See example below for
     *                          the last.
     * Some examples of using the filter are:
     *   * `annotation_spec_id!=4` --&gt; The model evaluation was done for
     *                             annotation spec with ID different than 4.
     *   * `NOT annotation_spec_id:*` --&gt; The model evaluation was done for
     *                                aggregate of all annotation specs.
     * </pre>
     *
     * <code>string filter = 3;</code>
     */
    public Builder setFilter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      filter_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An expression for filtering the results of the request.
     *   * `annotation_spec_id` - for =, !=  or existence. See example below for
     *                          the last.
     * Some examples of using the filter are:
     *   * `annotation_spec_id!=4` --&gt; The model evaluation was done for
     *                             annotation spec with ID different than 4.
     *   * `NOT annotation_spec_id:*` --&gt; The model evaluation was done for
     *                                aggregate of all annotation specs.
     * </pre>
     *
     * <code>string filter = 3;</code>
     */
    public Builder clearFilter() {

      filter_ = getDefaultInstance().getFilter();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An expression for filtering the results of the request.
     *   * `annotation_spec_id` - for =, !=  or existence. See example below for
     *                          the last.
     * Some examples of using the filter are:
     *   * `annotation_spec_id!=4` --&gt; The model evaluation was done for
     *                             annotation spec with ID different than 4.
     *   * `NOT annotation_spec_id:*` --&gt; The model evaluation was done for
     *                                aggregate of all annotation specs.
     * </pre>
     *
     * <code>string filter = 3;</code>
     */
    public Builder setFilterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      filter_ = value;
      onChanged();
      return this;
    }

    private int pageSize_;
    /**
     *
     *
     * <pre>
     * Requested page size.
     * </pre>
     *
     * <code>int32 page_size = 4;</code>
     */
    public int getPageSize() {
      return pageSize_;
    }
    /**
     *
     *
     * <pre>
     * Requested page size.
     * </pre>
     *
     * <code>int32 page_size = 4;</code>
     */
    public Builder setPageSize(int value) {

      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Requested page size.
     * </pre>
     *
     * <code>int32 page_size = 4;</code>
     */
    public Builder clearPageSize() {

      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token identifying a page of results for the server to return.
     * Typically obtained via
     * `ListModelEvaluationsResponse.next_page_token` of the previous
     * [AutoMl.ListModelEvaluations][google.cloud.automl.v1beta1.AutoMl.ListModelEvaluations]
     * call.
     * </pre>
     *
     * <code>string page_token = 6;</code>
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token identifying a page of results for the server to return.
     * Typically obtained via
     * `ListModelEvaluationsResponse.next_page_token` of the previous
     * [AutoMl.ListModelEvaluations][google.cloud.automl.v1beta1.AutoMl.ListModelEvaluations]
     * call.
     * </pre>
     *
     * <code>string page_token = 6;</code>
     */
    public com.google.protobuf.ByteString getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token identifying a page of results for the server to return.
     * Typically obtained via
     * `ListModelEvaluationsResponse.next_page_token` of the previous
     * [AutoMl.ListModelEvaluations][google.cloud.automl.v1beta1.AutoMl.ListModelEvaluations]
     * call.
     * </pre>
     *
     * <code>string page_token = 6;</code>
     */
    public Builder setPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      pageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token identifying a page of results for the server to return.
     * Typically obtained via
     * `ListModelEvaluationsResponse.next_page_token` of the previous
     * [AutoMl.ListModelEvaluations][google.cloud.automl.v1beta1.AutoMl.ListModelEvaluations]
     * call.
     * </pre>
     *
     * <code>string page_token = 6;</code>
     */
    public Builder clearPageToken() {

      pageToken_ = getDefaultInstance().getPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token identifying a page of results for the server to return.
     * Typically obtained via
     * `ListModelEvaluationsResponse.next_page_token` of the previous
     * [AutoMl.ListModelEvaluations][google.cloud.automl.v1beta1.AutoMl.ListModelEvaluations]
     * call.
     * </pre>
     *
     * <code>string page_token = 6;</code>
     */
    public Builder setPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      pageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.ListModelEvaluationsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.ListModelEvaluationsRequest)
  private static final com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest();
  }

  public static com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListModelEvaluationsRequest> PARSER =
      new com.google.protobuf.AbstractParser<ListModelEvaluationsRequest>() {
        @java.lang.Override
        public ListModelEvaluationsRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListModelEvaluationsRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListModelEvaluationsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListModelEvaluationsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.ListModelEvaluationsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
