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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.3
package com.google.privacy.dlp.v2;

public interface CreateDeidentifyTemplateRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.CreateDeidentifyTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Parent resource name.
   *
   * The format of this value varies depending on the scope of the request
   * (project or organization) and whether you have [specified a processing
   * location](https://cloud.google.com/sensitive-data-protection/docs/specifying-location):
   *
   * + Projects scope, location specified:&lt;br/&gt;
   *   `projects/`&lt;var&gt;PROJECT_ID&lt;/var&gt;`/locations/`&lt;var&gt;LOCATION_ID&lt;/var&gt;
   * + Projects scope, no location specified (defaults to global):&lt;br/&gt;
   *   `projects/`&lt;var&gt;PROJECT_ID&lt;/var&gt;
   * + Organizations scope, location specified:&lt;br/&gt;
   *   `organizations/`&lt;var&gt;ORG_ID&lt;/var&gt;`/locations/`&lt;var&gt;LOCATION_ID&lt;/var&gt;
   * + Organizations scope, no location specified (defaults to global):&lt;br/&gt;
   *   `organizations/`&lt;var&gt;ORG_ID&lt;/var&gt;
   *
   * The following example `parent` string specifies a parent project with the
   * identifier `example-project`, and specifies the `europe-west3` location
   * for processing data:
   *
   *     parent=projects/example-project/locations/europe-west3
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
   * Required. Parent resource name.
   *
   * The format of this value varies depending on the scope of the request
   * (project or organization) and whether you have [specified a processing
   * location](https://cloud.google.com/sensitive-data-protection/docs/specifying-location):
   *
   * + Projects scope, location specified:&lt;br/&gt;
   *   `projects/`&lt;var&gt;PROJECT_ID&lt;/var&gt;`/locations/`&lt;var&gt;LOCATION_ID&lt;/var&gt;
   * + Projects scope, no location specified (defaults to global):&lt;br/&gt;
   *   `projects/`&lt;var&gt;PROJECT_ID&lt;/var&gt;
   * + Organizations scope, location specified:&lt;br/&gt;
   *   `organizations/`&lt;var&gt;ORG_ID&lt;/var&gt;`/locations/`&lt;var&gt;LOCATION_ID&lt;/var&gt;
   * + Organizations scope, no location specified (defaults to global):&lt;br/&gt;
   *   `organizations/`&lt;var&gt;ORG_ID&lt;/var&gt;
   *
   * The following example `parent` string specifies a parent project with the
   * identifier `example-project`, and specifies the `europe-west3` location
   * for processing data:
   *
   *     parent=projects/example-project/locations/europe-west3
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
   * Required. The DeidentifyTemplate to create.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.DeidentifyTemplate deidentify_template = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the deidentifyTemplate field is set.
   */
  boolean hasDeidentifyTemplate();
  /**
   *
   *
   * <pre>
   * Required. The DeidentifyTemplate to create.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.DeidentifyTemplate deidentify_template = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The deidentifyTemplate.
   */
  com.google.privacy.dlp.v2.DeidentifyTemplate getDeidentifyTemplate();
  /**
   *
   *
   * <pre>
   * Required. The DeidentifyTemplate to create.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.DeidentifyTemplate deidentify_template = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.privacy.dlp.v2.DeidentifyTemplateOrBuilder getDeidentifyTemplateOrBuilder();

  /**
   *
   *
   * <pre>
   * The template id can contain uppercase and lowercase letters,
   * numbers, and hyphens; that is, it must match the regular
   * expression: `[a-zA-Z&#92;d-_]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string template_id = 3;</code>
   *
   * @return The templateId.
   */
  java.lang.String getTemplateId();
  /**
   *
   *
   * <pre>
   * The template id can contain uppercase and lowercase letters,
   * numbers, and hyphens; that is, it must match the regular
   * expression: `[a-zA-Z&#92;d-_]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string template_id = 3;</code>
   *
   * @return The bytes for templateId.
   */
  com.google.protobuf.ByteString getTemplateIdBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>string location_id = 4;</code>
   *
   * @return The locationId.
   */
  java.lang.String getLocationId();
  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>string location_id = 4;</code>
   *
   * @return The bytes for locationId.
   */
  com.google.protobuf.ByteString getLocationIdBytes();
}
