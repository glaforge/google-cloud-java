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
// source: google/cloud/enterpriseknowledgegraph/v1/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.enterpriseknowledgegraph.v1;

public interface SearchRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.enterpriseknowledgegraph.v1.SearchRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Entity's parent resource.
   * Format:
   * `projects/{project}/locations/{location}`
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
   * Required. The name of the Entity's parent resource.
   * Format:
   * `projects/{project}/locations/{location}`
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
   * Required. The literal query string for search.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Required. The literal query string for search.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * The list of language codes (defined in ISO 693) to run the query with,
   * e.g. 'en'.
   * </pre>
   *
   * <code>repeated string languages = 3;</code>
   *
   * @return A list containing the languages.
   */
  java.util.List<java.lang.String> getLanguagesList();
  /**
   *
   *
   * <pre>
   * The list of language codes (defined in ISO 693) to run the query with,
   * e.g. 'en'.
   * </pre>
   *
   * <code>repeated string languages = 3;</code>
   *
   * @return The count of languages.
   */
  int getLanguagesCount();
  /**
   *
   *
   * <pre>
   * The list of language codes (defined in ISO 693) to run the query with,
   * e.g. 'en'.
   * </pre>
   *
   * <code>repeated string languages = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The languages at the given index.
   */
  java.lang.String getLanguages(int index);
  /**
   *
   *
   * <pre>
   * The list of language codes (defined in ISO 693) to run the query with,
   * e.g. 'en'.
   * </pre>
   *
   * <code>repeated string languages = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the languages at the given index.
   */
  com.google.protobuf.ByteString getLanguagesBytes(int index);

  /**
   *
   *
   * <pre>
   * Restricts returned entities with these types, e.g. Person
   * (as defined in http://schema.org/Person). If multiple types are specified,
   * returned entities will contain one or more of these types.
   * </pre>
   *
   * <code>repeated string types = 4;</code>
   *
   * @return A list containing the types.
   */
  java.util.List<java.lang.String> getTypesList();
  /**
   *
   *
   * <pre>
   * Restricts returned entities with these types, e.g. Person
   * (as defined in http://schema.org/Person). If multiple types are specified,
   * returned entities will contain one or more of these types.
   * </pre>
   *
   * <code>repeated string types = 4;</code>
   *
   * @return The count of types.
   */
  int getTypesCount();
  /**
   *
   *
   * <pre>
   * Restricts returned entities with these types, e.g. Person
   * (as defined in http://schema.org/Person). If multiple types are specified,
   * returned entities will contain one or more of these types.
   * </pre>
   *
   * <code>repeated string types = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The types at the given index.
   */
  java.lang.String getTypes(int index);
  /**
   *
   *
   * <pre>
   * Restricts returned entities with these types, e.g. Person
   * (as defined in http://schema.org/Person). If multiple types are specified,
   * returned entities will contain one or more of these types.
   * </pre>
   *
   * <code>repeated string types = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the types at the given index.
   */
  com.google.protobuf.ByteString getTypesBytes(int index);

  /**
   *
   *
   * <pre>
   * Limits the number of entities to be returned.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 6;</code>
   *
   * @return Whether the limit field is set.
   */
  boolean hasLimit();
  /**
   *
   *
   * <pre>
   * Limits the number of entities to be returned.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 6;</code>
   *
   * @return The limit.
   */
  com.google.protobuf.Int32Value getLimit();
  /**
   *
   *
   * <pre>
   * Limits the number of entities to be returned.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 6;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getLimitOrBuilder();
}
