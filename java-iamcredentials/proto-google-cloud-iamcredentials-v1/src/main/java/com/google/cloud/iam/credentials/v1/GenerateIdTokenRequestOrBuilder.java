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
// source: google/iam/credentials/v1/common.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.iam.credentials.v1;

public interface GenerateIdTokenRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.credentials.v1.GenerateIdTokenRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the service account for which the credentials
   * are requested, in the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard
   * character is required; replacing it with a project ID is invalid.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the service account for which the credentials
   * are requested, in the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard
   * character is required; replacing it with a project ID is invalid.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The sequence of service accounts in a delegation chain. Each service
   * account must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on its next service account in the chain. The last service account in the
   * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on the service account that is specified in the `name` field of the
   * request.
   *
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard
   * character is required; replacing it with a project ID is invalid.
   * </pre>
   *
   * <code>repeated string delegates = 2;</code>
   *
   * @return A list containing the delegates.
   */
  java.util.List<java.lang.String> getDelegatesList();
  /**
   *
   *
   * <pre>
   * The sequence of service accounts in a delegation chain. Each service
   * account must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on its next service account in the chain. The last service account in the
   * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on the service account that is specified in the `name` field of the
   * request.
   *
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard
   * character is required; replacing it with a project ID is invalid.
   * </pre>
   *
   * <code>repeated string delegates = 2;</code>
   *
   * @return The count of delegates.
   */
  int getDelegatesCount();
  /**
   *
   *
   * <pre>
   * The sequence of service accounts in a delegation chain. Each service
   * account must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on its next service account in the chain. The last service account in the
   * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on the service account that is specified in the `name` field of the
   * request.
   *
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard
   * character is required; replacing it with a project ID is invalid.
   * </pre>
   *
   * <code>repeated string delegates = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The delegates at the given index.
   */
  java.lang.String getDelegates(int index);
  /**
   *
   *
   * <pre>
   * The sequence of service accounts in a delegation chain. Each service
   * account must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on its next service account in the chain. The last service account in the
   * chain must be granted the `roles/iam.serviceAccountTokenCreator` role
   * on the service account that is specified in the `name` field of the
   * request.
   *
   * The delegates must have the following format:
   * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard
   * character is required; replacing it with a project ID is invalid.
   * </pre>
   *
   * <code>repeated string delegates = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the delegates at the given index.
   */
  com.google.protobuf.ByteString getDelegatesBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. The audience for the token, such as the API or account that this token
   * grants access to.
   * </pre>
   *
   * <code>string audience = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The audience.
   */
  java.lang.String getAudience();
  /**
   *
   *
   * <pre>
   * Required. The audience for the token, such as the API or account that this token
   * grants access to.
   * </pre>
   *
   * <code>string audience = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for audience.
   */
  com.google.protobuf.ByteString getAudienceBytes();

  /**
   *
   *
   * <pre>
   * Include the service account email in the token. If set to `true`, the
   * token will contain `email` and `email_verified` claims.
   * </pre>
   *
   * <code>bool include_email = 4;</code>
   *
   * @return The includeEmail.
   */
  boolean getIncludeEmail();
}
