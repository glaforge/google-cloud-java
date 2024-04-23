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
// source: google/cloud/accessapproval/v1/accessapproval.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.accessapproval.v1;

public interface SignatureInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.accessapproval.v1.SignatureInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The digital signature.
   * </pre>
   *
   * <code>bytes signature = 1;</code>
   *
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();

  /**
   *
   *
   * <pre>
   * The public key for the Google default signing, encoded in PEM format. The
   * signature was created using a private key which may be verified using
   * this public key.
   * </pre>
   *
   * <code>string google_public_key_pem = 2;</code>
   *
   * @return Whether the googlePublicKeyPem field is set.
   */
  boolean hasGooglePublicKeyPem();
  /**
   *
   *
   * <pre>
   * The public key for the Google default signing, encoded in PEM format. The
   * signature was created using a private key which may be verified using
   * this public key.
   * </pre>
   *
   * <code>string google_public_key_pem = 2;</code>
   *
   * @return The googlePublicKeyPem.
   */
  java.lang.String getGooglePublicKeyPem();
  /**
   *
   *
   * <pre>
   * The public key for the Google default signing, encoded in PEM format. The
   * signature was created using a private key which may be verified using
   * this public key.
   * </pre>
   *
   * <code>string google_public_key_pem = 2;</code>
   *
   * @return The bytes for googlePublicKeyPem.
   */
  com.google.protobuf.ByteString getGooglePublicKeyPemBytes();

  /**
   *
   *
   * <pre>
   * The resource name of the customer CryptoKeyVersion used for signing.
   * </pre>
   *
   * <code>string customer_kms_key_version = 3;</code>
   *
   * @return Whether the customerKmsKeyVersion field is set.
   */
  boolean hasCustomerKmsKeyVersion();
  /**
   *
   *
   * <pre>
   * The resource name of the customer CryptoKeyVersion used for signing.
   * </pre>
   *
   * <code>string customer_kms_key_version = 3;</code>
   *
   * @return The customerKmsKeyVersion.
   */
  java.lang.String getCustomerKmsKeyVersion();
  /**
   *
   *
   * <pre>
   * The resource name of the customer CryptoKeyVersion used for signing.
   * </pre>
   *
   * <code>string customer_kms_key_version = 3;</code>
   *
   * @return The bytes for customerKmsKeyVersion.
   */
  com.google.protobuf.ByteString getCustomerKmsKeyVersionBytes();

  com.google.cloud.accessapproval.v1.SignatureInfo.VerificationInfoCase getVerificationInfoCase();
}
