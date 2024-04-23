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
// source: google/cloud/gkehub/v1beta1/membership.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkehub.v1beta1;

public interface GenerateExclusivityManifestResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1beta1.GenerateExclusivityManifestResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The YAML manifest of the membership CRD to apply if a newer version of the
   * CRD is available. Empty if no update needs to be applied.
   * </pre>
   *
   * <code>string crd_manifest = 1;</code>
   *
   * @return The crdManifest.
   */
  java.lang.String getCrdManifest();
  /**
   *
   *
   * <pre>
   * The YAML manifest of the membership CRD to apply if a newer version of the
   * CRD is available. Empty if no update needs to be applied.
   * </pre>
   *
   * <code>string crd_manifest = 1;</code>
   *
   * @return The bytes for crdManifest.
   */
  com.google.protobuf.ByteString getCrdManifestBytes();

  /**
   *
   *
   * <pre>
   * The YAML manifest of the membership CR to apply if a new version of the
   * CR is available. Empty if no update needs to be applied.
   * </pre>
   *
   * <code>string cr_manifest = 2;</code>
   *
   * @return The crManifest.
   */
  java.lang.String getCrManifest();
  /**
   *
   *
   * <pre>
   * The YAML manifest of the membership CR to apply if a new version of the
   * CR is available. Empty if no update needs to be applied.
   * </pre>
   *
   * <code>string cr_manifest = 2;</code>
   *
   * @return The bytes for crManifest.
   */
  com.google.protobuf.ByteString getCrManifestBytes();
}
