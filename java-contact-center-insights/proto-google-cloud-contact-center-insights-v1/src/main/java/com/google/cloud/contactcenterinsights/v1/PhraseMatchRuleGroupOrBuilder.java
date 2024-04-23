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
// source: google/cloud/contactcenterinsights/v1/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.contactcenterinsights.v1;

public interface PhraseMatchRuleGroupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.PhraseMatchRuleGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The type of this phrase match rule group.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.PhraseMatchRuleGroup.PhraseMatchRuleGroupType type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Required. The type of this phrase match rule group.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.PhraseMatchRuleGroup.PhraseMatchRuleGroupType type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleGroup.PhraseMatchRuleGroupType getType();

  /**
   *
   *
   * <pre>
   * A list of phrase match rules that are included in this group.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.PhraseMatchRule phrase_match_rules = 2;
   * </code>
   */
  java.util.List<com.google.cloud.contactcenterinsights.v1.PhraseMatchRule>
      getPhraseMatchRulesList();
  /**
   *
   *
   * <pre>
   * A list of phrase match rules that are included in this group.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.PhraseMatchRule phrase_match_rules = 2;
   * </code>
   */
  com.google.cloud.contactcenterinsights.v1.PhraseMatchRule getPhraseMatchRules(int index);
  /**
   *
   *
   * <pre>
   * A list of phrase match rules that are included in this group.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.PhraseMatchRule phrase_match_rules = 2;
   * </code>
   */
  int getPhraseMatchRulesCount();
  /**
   *
   *
   * <pre>
   * A list of phrase match rules that are included in this group.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.PhraseMatchRule phrase_match_rules = 2;
   * </code>
   */
  java.util.List<? extends com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleOrBuilder>
      getPhraseMatchRulesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of phrase match rules that are included in this group.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.PhraseMatchRule phrase_match_rules = 2;
   * </code>
   */
  com.google.cloud.contactcenterinsights.v1.PhraseMatchRuleOrBuilder getPhraseMatchRulesOrBuilder(
      int index);
}
