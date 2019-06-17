// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface CreateKeyRingRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.CreateKeyRingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the location associated with the
   * [KeyRings][google.cloud.kms.v1.KeyRing], in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the location associated with the
   * [KeyRings][google.cloud.kms.v1.KeyRing], in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. It must be unique within a location and match the regular
   * expression `[a-zA-Z0-9_-]{1,63}`
   * </pre>
   *
   * <code>string key_ring_id = 2;</code>
   */
  java.lang.String getKeyRingId();
  /**
   *
   *
   * <pre>
   * Required. It must be unique within a location and match the regular
   * expression `[a-zA-Z0-9_-]{1,63}`
   * </pre>
   *
   * <code>string key_ring_id = 2;</code>
   */
  com.google.protobuf.ByteString getKeyRingIdBytes();

  /**
   *
   *
   * <pre>
   * A [KeyRing][google.cloud.kms.v1.KeyRing] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.KeyRing key_ring = 3;</code>
   */
  boolean hasKeyRing();
  /**
   *
   *
   * <pre>
   * A [KeyRing][google.cloud.kms.v1.KeyRing] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.KeyRing key_ring = 3;</code>
   */
  com.google.cloud.kms.v1.KeyRing getKeyRing();
  /**
   *
   *
   * <pre>
   * A [KeyRing][google.cloud.kms.v1.KeyRing] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.KeyRing key_ring = 3;</code>
   */
  com.google.cloud.kms.v1.KeyRingOrBuilder getKeyRingOrBuilder();
}
