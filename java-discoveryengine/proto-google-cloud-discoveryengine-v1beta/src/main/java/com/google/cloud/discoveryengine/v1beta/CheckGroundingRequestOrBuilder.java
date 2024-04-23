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
// source: google/cloud/discoveryengine/v1beta/grounded_generation_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1beta;

public interface CheckGroundingRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.CheckGroundingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the grounding config, such as
   * `projects/&#42;&#47;locations/global/groundingConfigs/default_grounding_config`.
   * </pre>
   *
   * <code>
   * string grounding_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The groundingConfig.
   */
  java.lang.String getGroundingConfig();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the grounding config, such as
   * `projects/&#42;&#47;locations/global/groundingConfigs/default_grounding_config`.
   * </pre>
   *
   * <code>
   * string grounding_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for groundingConfig.
   */
  com.google.protobuf.ByteString getGroundingConfigBytes();

  /**
   *
   *
   * <pre>
   * Answer candidate to check.
   * </pre>
   *
   * <code>string answer_candidate = 2;</code>
   *
   * @return The answerCandidate.
   */
  java.lang.String getAnswerCandidate();
  /**
   *
   *
   * <pre>
   * Answer candidate to check.
   * </pre>
   *
   * <code>string answer_candidate = 2;</code>
   *
   * @return The bytes for answerCandidate.
   */
  com.google.protobuf.ByteString getAnswerCandidateBytes();

  /**
   *
   *
   * <pre>
   * List of facts for the grounding check.
   * We support up to 200 facts.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.GroundingFact facts = 3;</code>
   */
  java.util.List<com.google.cloud.discoveryengine.v1beta.GroundingFact> getFactsList();
  /**
   *
   *
   * <pre>
   * List of facts for the grounding check.
   * We support up to 200 facts.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.GroundingFact facts = 3;</code>
   */
  com.google.cloud.discoveryengine.v1beta.GroundingFact getFacts(int index);
  /**
   *
   *
   * <pre>
   * List of facts for the grounding check.
   * We support up to 200 facts.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.GroundingFact facts = 3;</code>
   */
  int getFactsCount();
  /**
   *
   *
   * <pre>
   * List of facts for the grounding check.
   * We support up to 200 facts.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.GroundingFact facts = 3;</code>
   */
  java.util.List<? extends com.google.cloud.discoveryengine.v1beta.GroundingFactOrBuilder>
      getFactsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of facts for the grounding check.
   * We support up to 200 facts.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.GroundingFact facts = 3;</code>
   */
  com.google.cloud.discoveryengine.v1beta.GroundingFactOrBuilder getFactsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Configuration of the grounding check.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.CheckGroundingSpec grounding_spec = 4;</code>
   *
   * @return Whether the groundingSpec field is set.
   */
  boolean hasGroundingSpec();
  /**
   *
   *
   * <pre>
   * Configuration of the grounding check.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.CheckGroundingSpec grounding_spec = 4;</code>
   *
   * @return The groundingSpec.
   */
  com.google.cloud.discoveryengine.v1beta.CheckGroundingSpec getGroundingSpec();
  /**
   *
   *
   * <pre>
   * Configuration of the grounding check.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.CheckGroundingSpec grounding_spec = 4;</code>
   */
  com.google.cloud.discoveryengine.v1beta.CheckGroundingSpecOrBuilder getGroundingSpecOrBuilder();
}
