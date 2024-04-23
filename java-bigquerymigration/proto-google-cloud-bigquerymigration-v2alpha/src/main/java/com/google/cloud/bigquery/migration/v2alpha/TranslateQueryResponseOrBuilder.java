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
// source: google/cloud/bigquery/migration/v2alpha/translation_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.migration.v2alpha;

public interface TranslateQueryResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.migration.v2alpha.TranslateQueryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Immutable. The unique identifier for the SQL translation job.
   * Example: `projects/123/locations/us/translation/1234`
   * </pre>
   *
   * <code>
   * string translation_job = 4 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The translationJob.
   */
  java.lang.String getTranslationJob();
  /**
   *
   *
   * <pre>
   * Output only. Immutable. The unique identifier for the SQL translation job.
   * Example: `projects/123/locations/us/translation/1234`
   * </pre>
   *
   * <code>
   * string translation_job = 4 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for translationJob.
   */
  com.google.protobuf.ByteString getTranslationJobBytes();

  /**
   *
   *
   * <pre>
   * The translated result. This will be empty if the translation fails.
   * </pre>
   *
   * <code>string translated_query = 1;</code>
   *
   * @return The translatedQuery.
   */
  java.lang.String getTranslatedQuery();
  /**
   *
   *
   * <pre>
   * The translated result. This will be empty if the translation fails.
   * </pre>
   *
   * <code>string translated_query = 1;</code>
   *
   * @return The bytes for translatedQuery.
   */
  com.google.protobuf.ByteString getTranslatedQueryBytes();

  /**
   *
   *
   * <pre>
   * The list of errors encountered during the translation, if present.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.SqlTranslationError errors = 2;</code>
   */
  java.util.List<com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError> getErrorsList();
  /**
   *
   *
   * <pre>
   * The list of errors encountered during the translation, if present.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.SqlTranslationError errors = 2;</code>
   */
  com.google.cloud.bigquery.migration.v2alpha.SqlTranslationError getErrors(int index);
  /**
   *
   *
   * <pre>
   * The list of errors encountered during the translation, if present.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.SqlTranslationError errors = 2;</code>
   */
  int getErrorsCount();
  /**
   *
   *
   * <pre>
   * The list of errors encountered during the translation, if present.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.SqlTranslationError errors = 2;</code>
   */
  java.util.List<? extends com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorOrBuilder>
      getErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of errors encountered during the translation, if present.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.SqlTranslationError errors = 2;</code>
   */
  com.google.cloud.bigquery.migration.v2alpha.SqlTranslationErrorOrBuilder getErrorsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The list of warnings encountered during the translation, if present,
   * indicates non-semantically correct translation.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning warnings = 3;
   * </code>
   */
  java.util.List<com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning>
      getWarningsList();
  /**
   *
   *
   * <pre>
   * The list of warnings encountered during the translation, if present,
   * indicates non-semantically correct translation.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning warnings = 3;
   * </code>
   */
  com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning getWarnings(int index);
  /**
   *
   *
   * <pre>
   * The list of warnings encountered during the translation, if present,
   * indicates non-semantically correct translation.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning warnings = 3;
   * </code>
   */
  int getWarningsCount();
  /**
   *
   *
   * <pre>
   * The list of warnings encountered during the translation, if present,
   * indicates non-semantically correct translation.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning warnings = 3;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarningOrBuilder>
      getWarningsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of warnings encountered during the translation, if present,
   * indicates non-semantically correct translation.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.SqlTranslationWarning warnings = 3;
   * </code>
   */
  com.google.cloud.bigquery.migration.v2alpha.SqlTranslationWarningOrBuilder getWarningsOrBuilder(
      int index);
}
