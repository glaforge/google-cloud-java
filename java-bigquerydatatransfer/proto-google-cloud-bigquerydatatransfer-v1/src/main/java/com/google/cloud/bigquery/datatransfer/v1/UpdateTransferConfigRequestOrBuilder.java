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
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.datatransfer.v1;

public interface UpdateTransferConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.UpdateTransferConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Data transfer configuration to create.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the transferConfig field is set.
   */
  boolean hasTransferConfig();
  /**
   *
   *
   * <pre>
   * Required. Data transfer configuration to create.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The transferConfig.
   */
  com.google.cloud.bigquery.datatransfer.v1.TransferConfig getTransferConfig();
  /**
   *
   *
   * <pre>
   * Required. Data transfer configuration to create.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.bigquery.datatransfer.v1.TransferConfigOrBuilder getTransferConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional OAuth2 authorization code to use with this transfer configuration.
   * This is required only if `transferConfig.dataSourceId` is 'youtube_channel'
   * and new credentials are needed, as indicated by `CheckValidCreds`. In order
   * to obtain authorization_code, make a request to the following URL:
   * &lt;pre class="prettyprint" suppresswarning="true"&gt;
   * https://www.gstatic.com/bigquerydatatransfer/oauthz/auth?redirect_uri=urn:ietf:wg:oauth:2.0:oob&amp;response_type=authorization_code&amp;client_id=&lt;var&gt;client_id&lt;/var&gt;&amp;scope=&lt;var&gt;data_source_scopes&lt;/var&gt;
   * &lt;/pre&gt;
   * * The &lt;var&gt;client_id&lt;/var&gt; is the OAuth client_id of the a data source as
   * returned by ListDataSources method.
   * * &lt;var&gt;data_source_scopes&lt;/var&gt; are the scopes returned by ListDataSources
   * method.
   *
   * Note that this should not be set when `service_account_name` is used to
   * update the transfer config.
   * </pre>
   *
   * <code>string authorization_code = 3;</code>
   *
   * @return The authorizationCode.
   */
  java.lang.String getAuthorizationCode();
  /**
   *
   *
   * <pre>
   * Optional OAuth2 authorization code to use with this transfer configuration.
   * This is required only if `transferConfig.dataSourceId` is 'youtube_channel'
   * and new credentials are needed, as indicated by `CheckValidCreds`. In order
   * to obtain authorization_code, make a request to the following URL:
   * &lt;pre class="prettyprint" suppresswarning="true"&gt;
   * https://www.gstatic.com/bigquerydatatransfer/oauthz/auth?redirect_uri=urn:ietf:wg:oauth:2.0:oob&amp;response_type=authorization_code&amp;client_id=&lt;var&gt;client_id&lt;/var&gt;&amp;scope=&lt;var&gt;data_source_scopes&lt;/var&gt;
   * &lt;/pre&gt;
   * * The &lt;var&gt;client_id&lt;/var&gt; is the OAuth client_id of the a data source as
   * returned by ListDataSources method.
   * * &lt;var&gt;data_source_scopes&lt;/var&gt; are the scopes returned by ListDataSources
   * method.
   *
   * Note that this should not be set when `service_account_name` is used to
   * update the transfer config.
   * </pre>
   *
   * <code>string authorization_code = 3;</code>
   *
   * @return The bytes for authorizationCode.
   */
  com.google.protobuf.ByteString getAuthorizationCodeBytes();

  /**
   *
   *
   * <pre>
   * Required. Required list of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Required list of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Required list of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional version info. This is required only if
   * `transferConfig.dataSourceId` is not 'youtube_channel' and new credentials
   * are needed, as indicated by `CheckValidCreds`. In order to obtain version
   * info, make a request to the following URL:
   * &lt;pre class="prettyprint" suppresswarning="true"&gt;
   * https://www.gstatic.com/bigquerydatatransfer/oauthz/auth?redirect_uri=urn:ietf:wg:oauth:2.0:oob&amp;response_type=version_info&amp;client_id=&lt;var&gt;client_id&lt;/var&gt;&amp;scope=&lt;var&gt;data_source_scopes&lt;/var&gt;
   * &lt;/pre&gt;
   * * The &lt;var&gt;client_id&lt;/var&gt; is the OAuth client_id of the a data source as
   * returned by ListDataSources method.
   * * &lt;var&gt;data_source_scopes&lt;/var&gt; are the scopes returned by ListDataSources
   * method.
   *
   * Note that this should not be set when `service_account_name` is used to
   * update the transfer config.
   * </pre>
   *
   * <code>string version_info = 5;</code>
   *
   * @return The versionInfo.
   */
  java.lang.String getVersionInfo();
  /**
   *
   *
   * <pre>
   * Optional version info. This is required only if
   * `transferConfig.dataSourceId` is not 'youtube_channel' and new credentials
   * are needed, as indicated by `CheckValidCreds`. In order to obtain version
   * info, make a request to the following URL:
   * &lt;pre class="prettyprint" suppresswarning="true"&gt;
   * https://www.gstatic.com/bigquerydatatransfer/oauthz/auth?redirect_uri=urn:ietf:wg:oauth:2.0:oob&amp;response_type=version_info&amp;client_id=&lt;var&gt;client_id&lt;/var&gt;&amp;scope=&lt;var&gt;data_source_scopes&lt;/var&gt;
   * &lt;/pre&gt;
   * * The &lt;var&gt;client_id&lt;/var&gt; is the OAuth client_id of the a data source as
   * returned by ListDataSources method.
   * * &lt;var&gt;data_source_scopes&lt;/var&gt; are the scopes returned by ListDataSources
   * method.
   *
   * Note that this should not be set when `service_account_name` is used to
   * update the transfer config.
   * </pre>
   *
   * <code>string version_info = 5;</code>
   *
   * @return The bytes for versionInfo.
   */
  com.google.protobuf.ByteString getVersionInfoBytes();

  /**
   *
   *
   * <pre>
   * Optional service account email. If this field is set, the transfer config
   * will be created with this service account's credentials. It requires that
   * the requesting user calling this API has permissions to act as this service
   * account.
   *
   * Note that not all data sources support service account credentials when
   * creating a transfer config. For the latest list of data sources, read about
   * [using service
   * accounts](https://cloud.google.com/bigquery-transfer/docs/use-service-accounts).
   * </pre>
   *
   * <code>string service_account_name = 6;</code>
   *
   * @return The serviceAccountName.
   */
  java.lang.String getServiceAccountName();
  /**
   *
   *
   * <pre>
   * Optional service account email. If this field is set, the transfer config
   * will be created with this service account's credentials. It requires that
   * the requesting user calling this API has permissions to act as this service
   * account.
   *
   * Note that not all data sources support service account credentials when
   * creating a transfer config. For the latest list of data sources, read about
   * [using service
   * accounts](https://cloud.google.com/bigquery-transfer/docs/use-service-accounts).
   * </pre>
   *
   * <code>string service_account_name = 6;</code>
   *
   * @return The bytes for serviceAccountName.
   */
  com.google.protobuf.ByteString getServiceAccountNameBytes();
}
