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
// source: google/cloud/dialogflow/cx/v3beta1/entity_type.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.cx.v3beta1;

public interface ExportEntityTypesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.ExportEntityTypesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the parent agent to export entity types.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;`.
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
   * Required. The name of the parent agent to export entity types.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;`.
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
   * Required. The name of the entity types to export.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/entityTypes/&lt;EntityType ID&gt;`.
   * </pre>
   *
   * <code>repeated string entity_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the entityTypes.
   */
  java.util.List<java.lang.String> getEntityTypesList();
  /**
   *
   *
   * <pre>
   * Required. The name of the entity types to export.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/entityTypes/&lt;EntityType ID&gt;`.
   * </pre>
   *
   * <code>repeated string entity_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of entityTypes.
   */
  int getEntityTypesCount();
  /**
   *
   *
   * <pre>
   * Required. The name of the entity types to export.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/entityTypes/&lt;EntityType ID&gt;`.
   * </pre>
   *
   * <code>repeated string entity_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The entityTypes at the given index.
   */
  java.lang.String getEntityTypes(int index);
  /**
   *
   *
   * <pre>
   * Required. The name of the entity types to export.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/entityTypes/&lt;EntityType ID&gt;`.
   * </pre>
   *
   * <code>repeated string entity_types = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the entityTypes at the given index.
   */
  com.google.protobuf.ByteString getEntityTypesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The [Google Cloud
   * Storage](https://cloud.google.com/storage/docs/) URI to export the entity
   * types to. The format of this URI must be
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   *
   * Dialogflow performs a write operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have write permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string entity_types_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the entityTypesUri field is set.
   */
  boolean hasEntityTypesUri();
  /**
   *
   *
   * <pre>
   * Optional. The [Google Cloud
   * Storage](https://cloud.google.com/storage/docs/) URI to export the entity
   * types to. The format of this URI must be
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   *
   * Dialogflow performs a write operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have write permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string entity_types_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The entityTypesUri.
   */
  java.lang.String getEntityTypesUri();
  /**
   *
   *
   * <pre>
   * Optional. The [Google Cloud
   * Storage](https://cloud.google.com/storage/docs/) URI to export the entity
   * types to. The format of this URI must be
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   *
   * Dialogflow performs a write operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have write permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string entity_types_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for entityTypesUri.
   */
  com.google.protobuf.ByteString getEntityTypesUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. The option to return the serialized entity types inline.
   * </pre>
   *
   * <code>bool entity_types_content_inline = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the entityTypesContentInline field is set.
   */
  boolean hasEntityTypesContentInline();
  /**
   *
   *
   * <pre>
   * Optional. The option to return the serialized entity types inline.
   * </pre>
   *
   * <code>bool entity_types_content_inline = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The entityTypesContentInline.
   */
  boolean getEntityTypesContentInline();

  /**
   *
   *
   * <pre>
   * Optional. The data format of the exported entity types. If not specified,
   * `BLOB` is assumed.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.ExportEntityTypesRequest.DataFormat data_format = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for dataFormat.
   */
  int getDataFormatValue();
  /**
   *
   *
   * <pre>
   * Optional. The data format of the exported entity types. If not specified,
   * `BLOB` is assumed.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.ExportEntityTypesRequest.DataFormat data_format = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The dataFormat.
   */
  com.google.cloud.dialogflow.cx.v3beta1.ExportEntityTypesRequest.DataFormat getDataFormat();

  /**
   *
   *
   * <pre>
   * Optional. The language to retrieve the entity type for. The following
   * fields are language dependent:
   *
   * *   `EntityType.entities.value`
   * *   `EntityType.entities.synonyms`
   * *   `EntityType.excluded_phrases.value`
   *
   * If not specified, all language dependent fields will be retrieved.
   * [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language)
   * are supported.
   * Note: languages must be enabled in the agent before they can be used.
   * </pre>
   *
   * <code>string language_code = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The language to retrieve the entity type for. The following
   * fields are language dependent:
   *
   * *   `EntityType.entities.value`
   * *   `EntityType.entities.synonyms`
   * *   `EntityType.excluded_phrases.value`
   *
   * If not specified, all language dependent fields will be retrieved.
   * [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language)
   * are supported.
   * Note: languages must be enabled in the agent before they can be used.
   * </pre>
   *
   * <code>string language_code = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  com.google.cloud.dialogflow.cx.v3beta1.ExportEntityTypesRequest.DestinationCase
      getDestinationCase();
}
