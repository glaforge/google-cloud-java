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
// source: google/cloud/security/publicca/v1beta1/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.security.publicca.v1beta1;

public interface CreateExternalAccountKeyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.publicca.v1beta1.CreateExternalAccountKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource where this external_account_key will be created.
   * Format: projects/[project_id]/locations/[location].
   * At present only the "global" location is supported.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource where this external_account_key will be created.
   * Format: projects/[project_id]/locations/[location].
   * At present only the "global" location is supported.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The external account key to create. This field only exists to future-proof
   * the API. At present, all fields in ExternalAccountKey are output only and
   * all values are ignored. For the purpose of the
   * CreateExternalAccountKeyRequest, set it to a default/empty value.
   * </pre>
   *
   * <code>
   * .google.cloud.security.publicca.v1beta1.ExternalAccountKey external_account_key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the externalAccountKey field is set.
   */
  boolean hasExternalAccountKey();
  /**
   *
   *
   * <pre>
   * Required. The external account key to create. This field only exists to future-proof
   * the API. At present, all fields in ExternalAccountKey are output only and
   * all values are ignored. For the purpose of the
   * CreateExternalAccountKeyRequest, set it to a default/empty value.
   * </pre>
   *
   * <code>
   * .google.cloud.security.publicca.v1beta1.ExternalAccountKey external_account_key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The externalAccountKey.
   */
  com.google.cloud.security.publicca.v1beta1.ExternalAccountKey getExternalAccountKey();
  /**
   *
   *
   * <pre>
   * Required. The external account key to create. This field only exists to future-proof
   * the API. At present, all fields in ExternalAccountKey are output only and
   * all values are ignored. For the purpose of the
   * CreateExternalAccountKeyRequest, set it to a default/empty value.
   * </pre>
   *
   * <code>
   * .google.cloud.security.publicca.v1beta1.ExternalAccountKey external_account_key = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.security.publicca.v1beta1.ExternalAccountKeyOrBuilder
      getExternalAccountKeyOrBuilder();
}
