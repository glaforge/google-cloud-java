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
// source: google/devtools/cloudbuild/v2/repositories.proto

// Protobuf Java Version: 3.25.3
package com.google.cloudbuild.v2;

public interface GitLabConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v2.GitLabConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The URI of the GitLab Enterprise host this connection is for.
   * If not specified, the default value is https://gitlab.com.
   * </pre>
   *
   * <code>string host_uri = 1;</code>
   *
   * @return The hostUri.
   */
  java.lang.String getHostUri();
  /**
   *
   *
   * <pre>
   * The URI of the GitLab Enterprise host this connection is for.
   * If not specified, the default value is https://gitlab.com.
   * </pre>
   *
   * <code>string host_uri = 1;</code>
   *
   * @return The bytes for hostUri.
   */
  com.google.protobuf.ByteString getHostUriBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. SecretManager resource containing the webhook secret
   * of a GitLab Enterprise project, formatted as
   * `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
   * </pre>
   *
   * <code>
   * string webhook_secret_secret_version = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The webhookSecretSecretVersion.
   */
  java.lang.String getWebhookSecretSecretVersion();
  /**
   *
   *
   * <pre>
   * Required. Immutable. SecretManager resource containing the webhook secret
   * of a GitLab Enterprise project, formatted as
   * `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
   * </pre>
   *
   * <code>
   * string webhook_secret_secret_version = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for webhookSecretSecretVersion.
   */
  com.google.protobuf.ByteString getWebhookSecretSecretVersionBytes();

  /**
   *
   *
   * <pre>
   * Required. A GitLab personal access token with the minimum `read_api` scope
   * access.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v2.UserCredential read_authorizer_credential = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the readAuthorizerCredential field is set.
   */
  boolean hasReadAuthorizerCredential();
  /**
   *
   *
   * <pre>
   * Required. A GitLab personal access token with the minimum `read_api` scope
   * access.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v2.UserCredential read_authorizer_credential = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The readAuthorizerCredential.
   */
  com.google.cloudbuild.v2.UserCredential getReadAuthorizerCredential();
  /**
   *
   *
   * <pre>
   * Required. A GitLab personal access token with the minimum `read_api` scope
   * access.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v2.UserCredential read_authorizer_credential = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloudbuild.v2.UserCredentialOrBuilder getReadAuthorizerCredentialOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. A GitLab personal access token with the `api` scope access.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v2.UserCredential authorizer_credential = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the authorizerCredential field is set.
   */
  boolean hasAuthorizerCredential();
  /**
   *
   *
   * <pre>
   * Required. A GitLab personal access token with the `api` scope access.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v2.UserCredential authorizer_credential = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The authorizerCredential.
   */
  com.google.cloudbuild.v2.UserCredential getAuthorizerCredential();
  /**
   *
   *
   * <pre>
   * Required. A GitLab personal access token with the `api` scope access.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v2.UserCredential authorizer_credential = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloudbuild.v2.UserCredentialOrBuilder getAuthorizerCredentialOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for using Service Directory to privately connect to a GitLab
   * Enterprise server. This should only be set if the GitLab Enterprise server
   * is hosted on-premises and not reachable by public internet. If this field
   * is left empty, calls to the GitLab Enterprise server will be made over the
   * public internet.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v2.ServiceDirectoryConfig service_directory_config = 5;
   * </code>
   *
   * @return Whether the serviceDirectoryConfig field is set.
   */
  boolean hasServiceDirectoryConfig();
  /**
   *
   *
   * <pre>
   * Configuration for using Service Directory to privately connect to a GitLab
   * Enterprise server. This should only be set if the GitLab Enterprise server
   * is hosted on-premises and not reachable by public internet. If this field
   * is left empty, calls to the GitLab Enterprise server will be made over the
   * public internet.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v2.ServiceDirectoryConfig service_directory_config = 5;
   * </code>
   *
   * @return The serviceDirectoryConfig.
   */
  com.google.cloudbuild.v2.ServiceDirectoryConfig getServiceDirectoryConfig();
  /**
   *
   *
   * <pre>
   * Configuration for using Service Directory to privately connect to a GitLab
   * Enterprise server. This should only be set if the GitLab Enterprise server
   * is hosted on-premises and not reachable by public internet. If this field
   * is left empty, calls to the GitLab Enterprise server will be made over the
   * public internet.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v2.ServiceDirectoryConfig service_directory_config = 5;
   * </code>
   */
  com.google.cloudbuild.v2.ServiceDirectoryConfigOrBuilder getServiceDirectoryConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * SSL certificate to use for requests to GitLab Enterprise.
   * </pre>
   *
   * <code>string ssl_ca = 6;</code>
   *
   * @return The sslCa.
   */
  java.lang.String getSslCa();
  /**
   *
   *
   * <pre>
   * SSL certificate to use for requests to GitLab Enterprise.
   * </pre>
   *
   * <code>string ssl_ca = 6;</code>
   *
   * @return The bytes for sslCa.
   */
  com.google.protobuf.ByteString getSslCaBytes();

  /**
   *
   *
   * <pre>
   * Output only. Version of the GitLab Enterprise server running on the
   * `host_uri`.
   * </pre>
   *
   * <code>string server_version = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The serverVersion.
   */
  java.lang.String getServerVersion();
  /**
   *
   *
   * <pre>
   * Output only. Version of the GitLab Enterprise server running on the
   * `host_uri`.
   * </pre>
   *
   * <code>string server_version = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for serverVersion.
   */
  com.google.protobuf.ByteString getServerVersionBytes();
}
