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

public interface InspectConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.InspectConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Restricts what info_types to look for. The values must correspond to
   * InfoType values returned by ListInfoTypes or listed at
   * https://cloud.google.com/sensitive-data-protection/docs/infotypes-reference.
   *
   * When no InfoTypes or CustomInfoTypes are specified in a request, the
   * system may automatically choose a default list of detectors to run, which
   * may change over time.
   *
   * If you need precise control and predictability as to what detectors are
   * run you should specify specific InfoTypes listed in the reference,
   * otherwise a default list will be used, which may change over time.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoType info_types = 1;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.InfoType> getInfoTypesList();
  /**
   *
   *
   * <pre>
   * Restricts what info_types to look for. The values must correspond to
   * InfoType values returned by ListInfoTypes or listed at
   * https://cloud.google.com/sensitive-data-protection/docs/infotypes-reference.
   *
   * When no InfoTypes or CustomInfoTypes are specified in a request, the
   * system may automatically choose a default list of detectors to run, which
   * may change over time.
   *
   * If you need precise control and predictability as to what detectors are
   * run you should specify specific InfoTypes listed in the reference,
   * otherwise a default list will be used, which may change over time.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoType info_types = 1;</code>
   */
  com.google.privacy.dlp.v2.InfoType getInfoTypes(int index);
  /**
   *
   *
   * <pre>
   * Restricts what info_types to look for. The values must correspond to
   * InfoType values returned by ListInfoTypes or listed at
   * https://cloud.google.com/sensitive-data-protection/docs/infotypes-reference.
   *
   * When no InfoTypes or CustomInfoTypes are specified in a request, the
   * system may automatically choose a default list of detectors to run, which
   * may change over time.
   *
   * If you need precise control and predictability as to what detectors are
   * run you should specify specific InfoTypes listed in the reference,
   * otherwise a default list will be used, which may change over time.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoType info_types = 1;</code>
   */
  int getInfoTypesCount();
  /**
   *
   *
   * <pre>
   * Restricts what info_types to look for. The values must correspond to
   * InfoType values returned by ListInfoTypes or listed at
   * https://cloud.google.com/sensitive-data-protection/docs/infotypes-reference.
   *
   * When no InfoTypes or CustomInfoTypes are specified in a request, the
   * system may automatically choose a default list of detectors to run, which
   * may change over time.
   *
   * If you need precise control and predictability as to what detectors are
   * run you should specify specific InfoTypes listed in the reference,
   * otherwise a default list will be used, which may change over time.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoType info_types = 1;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.InfoTypeOrBuilder> getInfoTypesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Restricts what info_types to look for. The values must correspond to
   * InfoType values returned by ListInfoTypes or listed at
   * https://cloud.google.com/sensitive-data-protection/docs/infotypes-reference.
   *
   * When no InfoTypes or CustomInfoTypes are specified in a request, the
   * system may automatically choose a default list of detectors to run, which
   * may change over time.
   *
   * If you need precise control and predictability as to what detectors are
   * run you should specify specific InfoTypes listed in the reference,
   * otherwise a default list will be used, which may change over time.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoType info_types = 1;</code>
   */
  com.google.privacy.dlp.v2.InfoTypeOrBuilder getInfoTypesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Only returns findings equal to or above this threshold. The default is
   * POSSIBLE.
   *
   * In general, the highest likelihood setting yields the fewest findings in
   * results and the lowest chance of a false positive. For more information,
   * see [Match
   * likelihood](https://cloud.google.com/sensitive-data-protection/docs/likelihood).
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Likelihood min_likelihood = 2;</code>
   *
   * @return The enum numeric value on the wire for minLikelihood.
   */
  int getMinLikelihoodValue();
  /**
   *
   *
   * <pre>
   * Only returns findings equal to or above this threshold. The default is
   * POSSIBLE.
   *
   * In general, the highest likelihood setting yields the fewest findings in
   * results and the lowest chance of a false positive. For more information,
   * see [Match
   * likelihood](https://cloud.google.com/sensitive-data-protection/docs/likelihood).
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Likelihood min_likelihood = 2;</code>
   *
   * @return The minLikelihood.
   */
  com.google.privacy.dlp.v2.Likelihood getMinLikelihood();

  /**
   *
   *
   * <pre>
   * Minimum likelihood per infotype. For each infotype, a user can specify a
   * minimum likelihood. The system only returns a finding if its likelihood is
   * above this threshold. If this field is not set, the system uses the
   * InspectConfig min_likelihood.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.InspectConfig.InfoTypeLikelihood min_likelihood_per_info_type = 11;
   * </code>
   */
  java.util.List<com.google.privacy.dlp.v2.InspectConfig.InfoTypeLikelihood>
      getMinLikelihoodPerInfoTypeList();
  /**
   *
   *
   * <pre>
   * Minimum likelihood per infotype. For each infotype, a user can specify a
   * minimum likelihood. The system only returns a finding if its likelihood is
   * above this threshold. If this field is not set, the system uses the
   * InspectConfig min_likelihood.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.InspectConfig.InfoTypeLikelihood min_likelihood_per_info_type = 11;
   * </code>
   */
  com.google.privacy.dlp.v2.InspectConfig.InfoTypeLikelihood getMinLikelihoodPerInfoType(int index);
  /**
   *
   *
   * <pre>
   * Minimum likelihood per infotype. For each infotype, a user can specify a
   * minimum likelihood. The system only returns a finding if its likelihood is
   * above this threshold. If this field is not set, the system uses the
   * InspectConfig min_likelihood.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.InspectConfig.InfoTypeLikelihood min_likelihood_per_info_type = 11;
   * </code>
   */
  int getMinLikelihoodPerInfoTypeCount();
  /**
   *
   *
   * <pre>
   * Minimum likelihood per infotype. For each infotype, a user can specify a
   * minimum likelihood. The system only returns a finding if its likelihood is
   * above this threshold. If this field is not set, the system uses the
   * InspectConfig min_likelihood.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.InspectConfig.InfoTypeLikelihood min_likelihood_per_info_type = 11;
   * </code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.InspectConfig.InfoTypeLikelihoodOrBuilder>
      getMinLikelihoodPerInfoTypeOrBuilderList();
  /**
   *
   *
   * <pre>
   * Minimum likelihood per infotype. For each infotype, a user can specify a
   * minimum likelihood. The system only returns a finding if its likelihood is
   * above this threshold. If this field is not set, the system uses the
   * InspectConfig min_likelihood.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.InspectConfig.InfoTypeLikelihood min_likelihood_per_info_type = 11;
   * </code>
   */
  com.google.privacy.dlp.v2.InspectConfig.InfoTypeLikelihoodOrBuilder
      getMinLikelihoodPerInfoTypeOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Configuration to control the number of findings returned.
   * This is not used for data profiling.
   *
   * When redacting sensitive data from images, finding limits don't apply. They
   * can cause unexpected or inconsistent results, where only some data is
   * redacted. Don't include finding limits in
   * [RedactImage][google.privacy.dlp.v2.DlpService.RedactImage]
   * requests. Otherwise, Cloud DLP returns an error.
   *
   * When set within an
   * [InspectJobConfig][google.privacy.dlp.v2.InspectJobConfig], the specified
   * maximum values aren't hard limits. If an inspection job reaches these
   * limits, the job ends gradually, not abruptly. Therefore, the actual number
   * of findings that Cloud DLP returns can be multiple times higher than these
   * maximum values.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig.FindingLimits limits = 3;</code>
   *
   * @return Whether the limits field is set.
   */
  boolean hasLimits();
  /**
   *
   *
   * <pre>
   * Configuration to control the number of findings returned.
   * This is not used for data profiling.
   *
   * When redacting sensitive data from images, finding limits don't apply. They
   * can cause unexpected or inconsistent results, where only some data is
   * redacted. Don't include finding limits in
   * [RedactImage][google.privacy.dlp.v2.DlpService.RedactImage]
   * requests. Otherwise, Cloud DLP returns an error.
   *
   * When set within an
   * [InspectJobConfig][google.privacy.dlp.v2.InspectJobConfig], the specified
   * maximum values aren't hard limits. If an inspection job reaches these
   * limits, the job ends gradually, not abruptly. Therefore, the actual number
   * of findings that Cloud DLP returns can be multiple times higher than these
   * maximum values.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig.FindingLimits limits = 3;</code>
   *
   * @return The limits.
   */
  com.google.privacy.dlp.v2.InspectConfig.FindingLimits getLimits();
  /**
   *
   *
   * <pre>
   * Configuration to control the number of findings returned.
   * This is not used for data profiling.
   *
   * When redacting sensitive data from images, finding limits don't apply. They
   * can cause unexpected or inconsistent results, where only some data is
   * redacted. Don't include finding limits in
   * [RedactImage][google.privacy.dlp.v2.DlpService.RedactImage]
   * requests. Otherwise, Cloud DLP returns an error.
   *
   * When set within an
   * [InspectJobConfig][google.privacy.dlp.v2.InspectJobConfig], the specified
   * maximum values aren't hard limits. If an inspection job reaches these
   * limits, the job ends gradually, not abruptly. Therefore, the actual number
   * of findings that Cloud DLP returns can be multiple times higher than these
   * maximum values.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig.FindingLimits limits = 3;</code>
   */
  com.google.privacy.dlp.v2.InspectConfig.FindingLimitsOrBuilder getLimitsOrBuilder();

  /**
   *
   *
   * <pre>
   * When true, a contextual quote from the data that triggered a finding is
   * included in the response; see
   * [Finding.quote][google.privacy.dlp.v2.Finding.quote]. This is not used for
   * data profiling.
   * </pre>
   *
   * <code>bool include_quote = 4;</code>
   *
   * @return The includeQuote.
   */
  boolean getIncludeQuote();

  /**
   *
   *
   * <pre>
   * When true, excludes type information of the findings.
   * This is not used for data profiling.
   * </pre>
   *
   * <code>bool exclude_info_types = 5;</code>
   *
   * @return The excludeInfoTypes.
   */
  boolean getExcludeInfoTypes();

  /**
   *
   *
   * <pre>
   * CustomInfoTypes provided by the user. See
   * https://cloud.google.com/sensitive-data-protection/docs/creating-custom-infotypes
   * to learn more.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CustomInfoType custom_info_types = 6;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.CustomInfoType> getCustomInfoTypesList();
  /**
   *
   *
   * <pre>
   * CustomInfoTypes provided by the user. See
   * https://cloud.google.com/sensitive-data-protection/docs/creating-custom-infotypes
   * to learn more.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CustomInfoType custom_info_types = 6;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType getCustomInfoTypes(int index);
  /**
   *
   *
   * <pre>
   * CustomInfoTypes provided by the user. See
   * https://cloud.google.com/sensitive-data-protection/docs/creating-custom-infotypes
   * to learn more.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CustomInfoType custom_info_types = 6;</code>
   */
  int getCustomInfoTypesCount();
  /**
   *
   *
   * <pre>
   * CustomInfoTypes provided by the user. See
   * https://cloud.google.com/sensitive-data-protection/docs/creating-custom-infotypes
   * to learn more.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CustomInfoType custom_info_types = 6;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.CustomInfoTypeOrBuilder>
      getCustomInfoTypesOrBuilderList();
  /**
   *
   *
   * <pre>
   * CustomInfoTypes provided by the user. See
   * https://cloud.google.com/sensitive-data-protection/docs/creating-custom-infotypes
   * to learn more.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CustomInfoType custom_info_types = 6;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoTypeOrBuilder getCustomInfoTypesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Deprecated and unused.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.ContentOption content_options = 8;</code>
   *
   * @return A list containing the contentOptions.
   */
  java.util.List<com.google.privacy.dlp.v2.ContentOption> getContentOptionsList();
  /**
   *
   *
   * <pre>
   * Deprecated and unused.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.ContentOption content_options = 8;</code>
   *
   * @return The count of contentOptions.
   */
  int getContentOptionsCount();
  /**
   *
   *
   * <pre>
   * Deprecated and unused.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.ContentOption content_options = 8;</code>
   *
   * @param index The index of the element to return.
   * @return The contentOptions at the given index.
   */
  com.google.privacy.dlp.v2.ContentOption getContentOptions(int index);
  /**
   *
   *
   * <pre>
   * Deprecated and unused.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.ContentOption content_options = 8;</code>
   *
   * @return A list containing the enum numeric values on the wire for contentOptions.
   */
  java.util.List<java.lang.Integer> getContentOptionsValueList();
  /**
   *
   *
   * <pre>
   * Deprecated and unused.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.ContentOption content_options = 8;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of contentOptions at the given index.
   */
  int getContentOptionsValue(int index);

  /**
   *
   *
   * <pre>
   * Set of rules to apply to the findings for this InspectConfig.
   * Exclusion rules, contained in the set are executed in the end, other
   * rules are executed in the order they are specified for each info type.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InspectionRuleSet rule_set = 10;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.InspectionRuleSet> getRuleSetList();
  /**
   *
   *
   * <pre>
   * Set of rules to apply to the findings for this InspectConfig.
   * Exclusion rules, contained in the set are executed in the end, other
   * rules are executed in the order they are specified for each info type.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InspectionRuleSet rule_set = 10;</code>
   */
  com.google.privacy.dlp.v2.InspectionRuleSet getRuleSet(int index);
  /**
   *
   *
   * <pre>
   * Set of rules to apply to the findings for this InspectConfig.
   * Exclusion rules, contained in the set are executed in the end, other
   * rules are executed in the order they are specified for each info type.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InspectionRuleSet rule_set = 10;</code>
   */
  int getRuleSetCount();
  /**
   *
   *
   * <pre>
   * Set of rules to apply to the findings for this InspectConfig.
   * Exclusion rules, contained in the set are executed in the end, other
   * rules are executed in the order they are specified for each info type.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InspectionRuleSet rule_set = 10;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.InspectionRuleSetOrBuilder>
      getRuleSetOrBuilderList();
  /**
   *
   *
   * <pre>
   * Set of rules to apply to the findings for this InspectConfig.
   * Exclusion rules, contained in the set are executed in the end, other
   * rules are executed in the order they are specified for each info type.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InspectionRuleSet rule_set = 10;</code>
   */
  com.google.privacy.dlp.v2.InspectionRuleSetOrBuilder getRuleSetOrBuilder(int index);
}
