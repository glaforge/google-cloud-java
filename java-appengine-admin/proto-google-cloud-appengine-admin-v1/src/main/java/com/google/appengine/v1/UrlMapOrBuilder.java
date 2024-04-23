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
// source: google/appengine/v1/app_yaml.proto

// Protobuf Java Version: 3.25.3
package com.google.appengine.v1;

public interface UrlMapOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.UrlMap)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * URL prefix. Uses regular expression syntax, which means regexp
   * special characters must be escaped, but should not contain groupings.
   * All URLs that begin with this prefix are handled by this handler, using the
   * portion of the URL after the prefix as part of the file path.
   * </pre>
   *
   * <code>string url_regex = 1;</code>
   *
   * @return The urlRegex.
   */
  java.lang.String getUrlRegex();
  /**
   *
   *
   * <pre>
   * URL prefix. Uses regular expression syntax, which means regexp
   * special characters must be escaped, but should not contain groupings.
   * All URLs that begin with this prefix are handled by this handler, using the
   * portion of the URL after the prefix as part of the file path.
   * </pre>
   *
   * <code>string url_regex = 1;</code>
   *
   * @return The bytes for urlRegex.
   */
  com.google.protobuf.ByteString getUrlRegexBytes();

  /**
   *
   *
   * <pre>
   * Returns the contents of a file, such as an image, as the response.
   * </pre>
   *
   * <code>.google.appengine.v1.StaticFilesHandler static_files = 2;</code>
   *
   * @return Whether the staticFiles field is set.
   */
  boolean hasStaticFiles();
  /**
   *
   *
   * <pre>
   * Returns the contents of a file, such as an image, as the response.
   * </pre>
   *
   * <code>.google.appengine.v1.StaticFilesHandler static_files = 2;</code>
   *
   * @return The staticFiles.
   */
  com.google.appengine.v1.StaticFilesHandler getStaticFiles();
  /**
   *
   *
   * <pre>
   * Returns the contents of a file, such as an image, as the response.
   * </pre>
   *
   * <code>.google.appengine.v1.StaticFilesHandler static_files = 2;</code>
   */
  com.google.appengine.v1.StaticFilesHandlerOrBuilder getStaticFilesOrBuilder();

  /**
   *
   *
   * <pre>
   * Executes a script to handle the requests that match this URL
   * pattern. Only the `auto` value is supported for Node.js in the
   * App Engine standard environment, for example `"script": "auto"`.
   * </pre>
   *
   * <code>.google.appengine.v1.ScriptHandler script = 3;</code>
   *
   * @return Whether the script field is set.
   */
  boolean hasScript();
  /**
   *
   *
   * <pre>
   * Executes a script to handle the requests that match this URL
   * pattern. Only the `auto` value is supported for Node.js in the
   * App Engine standard environment, for example `"script": "auto"`.
   * </pre>
   *
   * <code>.google.appengine.v1.ScriptHandler script = 3;</code>
   *
   * @return The script.
   */
  com.google.appengine.v1.ScriptHandler getScript();
  /**
   *
   *
   * <pre>
   * Executes a script to handle the requests that match this URL
   * pattern. Only the `auto` value is supported for Node.js in the
   * App Engine standard environment, for example `"script": "auto"`.
   * </pre>
   *
   * <code>.google.appengine.v1.ScriptHandler script = 3;</code>
   */
  com.google.appengine.v1.ScriptHandlerOrBuilder getScriptOrBuilder();

  /**
   *
   *
   * <pre>
   * Uses API Endpoints to handle requests.
   * </pre>
   *
   * <code>.google.appengine.v1.ApiEndpointHandler api_endpoint = 4;</code>
   *
   * @return Whether the apiEndpoint field is set.
   */
  boolean hasApiEndpoint();
  /**
   *
   *
   * <pre>
   * Uses API Endpoints to handle requests.
   * </pre>
   *
   * <code>.google.appengine.v1.ApiEndpointHandler api_endpoint = 4;</code>
   *
   * @return The apiEndpoint.
   */
  com.google.appengine.v1.ApiEndpointHandler getApiEndpoint();
  /**
   *
   *
   * <pre>
   * Uses API Endpoints to handle requests.
   * </pre>
   *
   * <code>.google.appengine.v1.ApiEndpointHandler api_endpoint = 4;</code>
   */
  com.google.appengine.v1.ApiEndpointHandlerOrBuilder getApiEndpointOrBuilder();

  /**
   *
   *
   * <pre>
   * Security (HTTPS) enforcement for this URL.
   * </pre>
   *
   * <code>.google.appengine.v1.SecurityLevel security_level = 5;</code>
   *
   * @return The enum numeric value on the wire for securityLevel.
   */
  int getSecurityLevelValue();
  /**
   *
   *
   * <pre>
   * Security (HTTPS) enforcement for this URL.
   * </pre>
   *
   * <code>.google.appengine.v1.SecurityLevel security_level = 5;</code>
   *
   * @return The securityLevel.
   */
  com.google.appengine.v1.SecurityLevel getSecurityLevel();

  /**
   *
   *
   * <pre>
   * Level of login required to access this resource. Not supported for Node.js
   * in the App Engine standard environment.
   * </pre>
   *
   * <code>.google.appengine.v1.LoginRequirement login = 6;</code>
   *
   * @return The enum numeric value on the wire for login.
   */
  int getLoginValue();
  /**
   *
   *
   * <pre>
   * Level of login required to access this resource. Not supported for Node.js
   * in the App Engine standard environment.
   * </pre>
   *
   * <code>.google.appengine.v1.LoginRequirement login = 6;</code>
   *
   * @return The login.
   */
  com.google.appengine.v1.LoginRequirement getLogin();

  /**
   *
   *
   * <pre>
   * Action to take when users access resources that require
   * authentication. Defaults to `redirect`.
   * </pre>
   *
   * <code>.google.appengine.v1.AuthFailAction auth_fail_action = 7;</code>
   *
   * @return The enum numeric value on the wire for authFailAction.
   */
  int getAuthFailActionValue();
  /**
   *
   *
   * <pre>
   * Action to take when users access resources that require
   * authentication. Defaults to `redirect`.
   * </pre>
   *
   * <code>.google.appengine.v1.AuthFailAction auth_fail_action = 7;</code>
   *
   * @return The authFailAction.
   */
  com.google.appengine.v1.AuthFailAction getAuthFailAction();

  /**
   *
   *
   * <pre>
   * `30x` code to use when performing redirects for the `secure` field.
   * Defaults to `302`.
   * </pre>
   *
   * <code>.google.appengine.v1.UrlMap.RedirectHttpResponseCode redirect_http_response_code = 8;
   * </code>
   *
   * @return The enum numeric value on the wire for redirectHttpResponseCode.
   */
  int getRedirectHttpResponseCodeValue();
  /**
   *
   *
   * <pre>
   * `30x` code to use when performing redirects for the `secure` field.
   * Defaults to `302`.
   * </pre>
   *
   * <code>.google.appengine.v1.UrlMap.RedirectHttpResponseCode redirect_http_response_code = 8;
   * </code>
   *
   * @return The redirectHttpResponseCode.
   */
  com.google.appengine.v1.UrlMap.RedirectHttpResponseCode getRedirectHttpResponseCode();

  com.google.appengine.v1.UrlMap.HandlerTypeCase getHandlerTypeCase();
}
