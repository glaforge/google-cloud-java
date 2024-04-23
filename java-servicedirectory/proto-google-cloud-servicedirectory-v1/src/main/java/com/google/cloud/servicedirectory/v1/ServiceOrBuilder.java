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
// source: google/cloud/servicedirectory/v1/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.servicedirectory.v1;

public interface ServiceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.servicedirectory.v1.Service)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. The resource name for the service in the format
   * `projects/&#42;&#47;locations/&#42;&#47;namespaces/&#42;&#47;services/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. The resource name for the service in the format
   * `projects/&#42;&#47;locations/&#42;&#47;namespaces/&#42;&#47;services/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Annotations for the service. This data can be consumed by service
   * clients.
   *
   * Restrictions:
   *
   * *   The entire annotations dictionary may contain up to 2000 characters,
   *     spread accoss all key-value pairs. Annotations that go beyond this
   *     limit are rejected
   * *   Valid annotation keys have two segments: an optional prefix and name,
   *     separated by a slash (/). The name segment is required and must be 63
   *     characters or less, beginning and ending with an alphanumeric character
   *     ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and
   *     alphanumerics between. The prefix is optional. If specified, the prefix
   *     must be a DNS subdomain: a series of DNS labels separated by dots (.),
   *     not longer than 253 characters in total, followed by a slash (/).
   *     Annotations that fails to meet these requirements are rejected
   *
   * Note: This field is equivalent to the `metadata` field in the v1beta1 API.
   * They have the same syntax and read/write to the same location in Service
   * Directory.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Optional. Annotations for the service. This data can be consumed by service
   * clients.
   *
   * Restrictions:
   *
   * *   The entire annotations dictionary may contain up to 2000 characters,
   *     spread accoss all key-value pairs. Annotations that go beyond this
   *     limit are rejected
   * *   Valid annotation keys have two segments: an optional prefix and name,
   *     separated by a slash (/). The name segment is required and must be 63
   *     characters or less, beginning and ending with an alphanumeric character
   *     ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and
   *     alphanumerics between. The prefix is optional. If specified, the prefix
   *     must be a DNS subdomain: a series of DNS labels separated by dots (.),
   *     not longer than 253 characters in total, followed by a slash (/).
   *     Annotations that fails to meet these requirements are rejected
   *
   * Note: This field is equivalent to the `metadata` field in the v1beta1 API.
   * They have the same syntax and read/write to the same location in Service
   * Directory.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Optional. Annotations for the service. This data can be consumed by service
   * clients.
   *
   * Restrictions:
   *
   * *   The entire annotations dictionary may contain up to 2000 characters,
   *     spread accoss all key-value pairs. Annotations that go beyond this
   *     limit are rejected
   * *   Valid annotation keys have two segments: an optional prefix and name,
   *     separated by a slash (/). The name segment is required and must be 63
   *     characters or less, beginning and ending with an alphanumeric character
   *     ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and
   *     alphanumerics between. The prefix is optional. If specified, the prefix
   *     must be a DNS subdomain: a series of DNS labels separated by dots (.),
   *     not longer than 253 characters in total, followed by a slash (/).
   *     Annotations that fails to meet these requirements are rejected
   *
   * Note: This field is equivalent to the `metadata` field in the v1beta1 API.
   * They have the same syntax and read/write to the same location in Service
   * Directory.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Optional. Annotations for the service. This data can be consumed by service
   * clients.
   *
   * Restrictions:
   *
   * *   The entire annotations dictionary may contain up to 2000 characters,
   *     spread accoss all key-value pairs. Annotations that go beyond this
   *     limit are rejected
   * *   Valid annotation keys have two segments: an optional prefix and name,
   *     separated by a slash (/). The name segment is required and must be 63
   *     characters or less, beginning and ending with an alphanumeric character
   *     ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and
   *     alphanumerics between. The prefix is optional. If specified, the prefix
   *     must be a DNS subdomain: a series of DNS labels separated by dots (.),
   *     not longer than 253 characters in total, followed by a slash (/).
   *     Annotations that fails to meet these requirements are rejected
   *
   * Note: This field is equivalent to the `metadata` field in the v1beta1 API.
   * They have the same syntax and read/write to the same location in Service
   * Directory.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Annotations for the service. This data can be consumed by service
   * clients.
   *
   * Restrictions:
   *
   * *   The entire annotations dictionary may contain up to 2000 characters,
   *     spread accoss all key-value pairs. Annotations that go beyond this
   *     limit are rejected
   * *   Valid annotation keys have two segments: an optional prefix and name,
   *     separated by a slash (/). The name segment is required and must be 63
   *     characters or less, beginning and ending with an alphanumeric character
   *     ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and
   *     alphanumerics between. The prefix is optional. If specified, the prefix
   *     must be a DNS subdomain: a series of DNS labels separated by dots (.),
   *     not longer than 253 characters in total, followed by a slash (/).
   *     Annotations that fails to meet these requirements are rejected
   *
   * Note: This field is equivalent to the `metadata` field in the v1beta1 API.
   * They have the same syntax and read/write to the same location in Service
   * Directory.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Endpoints associated with this service. Returned on
   * [LookupService.ResolveService][google.cloud.servicedirectory.v1.LookupService.ResolveService].
   * Control plane clients should use
   * [RegistrationService.ListEndpoints][google.cloud.servicedirectory.v1.RegistrationService.ListEndpoints].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.servicedirectory.v1.Endpoint endpoints = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.servicedirectory.v1.Endpoint> getEndpointsList();
  /**
   *
   *
   * <pre>
   * Output only. Endpoints associated with this service. Returned on
   * [LookupService.ResolveService][google.cloud.servicedirectory.v1.LookupService.ResolveService].
   * Control plane clients should use
   * [RegistrationService.ListEndpoints][google.cloud.servicedirectory.v1.RegistrationService.ListEndpoints].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.servicedirectory.v1.Endpoint endpoints = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.servicedirectory.v1.Endpoint getEndpoints(int index);
  /**
   *
   *
   * <pre>
   * Output only. Endpoints associated with this service. Returned on
   * [LookupService.ResolveService][google.cloud.servicedirectory.v1.LookupService.ResolveService].
   * Control plane clients should use
   * [RegistrationService.ListEndpoints][google.cloud.servicedirectory.v1.RegistrationService.ListEndpoints].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.servicedirectory.v1.Endpoint endpoints = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getEndpointsCount();
  /**
   *
   *
   * <pre>
   * Output only. Endpoints associated with this service. Returned on
   * [LookupService.ResolveService][google.cloud.servicedirectory.v1.LookupService.ResolveService].
   * Control plane clients should use
   * [RegistrationService.ListEndpoints][google.cloud.servicedirectory.v1.RegistrationService.ListEndpoints].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.servicedirectory.v1.Endpoint endpoints = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.servicedirectory.v1.EndpointOrBuilder>
      getEndpointsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Endpoints associated with this service. Returned on
   * [LookupService.ResolveService][google.cloud.servicedirectory.v1.LookupService.ResolveService].
   * Control plane clients should use
   * [RegistrationService.ListEndpoints][google.cloud.servicedirectory.v1.RegistrationService.ListEndpoints].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.servicedirectory.v1.Endpoint endpoints = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.servicedirectory.v1.EndpointOrBuilder getEndpointsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The globally unique identifier of the service in the UUID4
   * format.
   * </pre>
   *
   * <code>string uid = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. The globally unique identifier of the service in the UUID4
   * format.
   * </pre>
   *
   * <code>string uid = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();
}
