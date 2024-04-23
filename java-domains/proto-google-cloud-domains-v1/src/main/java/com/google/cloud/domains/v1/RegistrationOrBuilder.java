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
// source: google/cloud/domains/v1/domains.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.domains.v1;

public interface RegistrationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.domains.v1.Registration)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Name of the `Registration` resource, in the format
   * `projects/&#42;&#47;locations/&#42;&#47;registrations/&lt;domain_name&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Name of the `Registration` resource, in the format
   * `projects/&#42;&#47;locations/&#42;&#47;registrations/&lt;domain_name&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The domain name. Unicode domain names must be expressed in Punycode format.
   * </pre>
   *
   * <code>
   * string domain_name = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The domainName.
   */
  java.lang.String getDomainName();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The domain name. Unicode domain names must be expressed in Punycode format.
   * </pre>
   *
   * <code>
   * string domain_name = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for domainName.
   */
  com.google.protobuf.ByteString getDomainNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of the `Registration` resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of the `Registration` resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of the `Registration` resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The expiration timestamp of the `Registration`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   *
   *
   * <pre>
   * Output only. The expiration timestamp of the `Registration`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   *
   *
   * <pre>
   * Output only. The expiration timestamp of the `Registration`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The state of the `Registration`
   * </pre>
   *
   * <code>
   * .google.cloud.domains.v1.Registration.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The state of the `Registration`
   * </pre>
   *
   * <code>
   * .google.cloud.domains.v1.Registration.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.domains.v1.Registration.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The set of issues with the `Registration` that require attention.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.domains.v1.Registration.Issue issues = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the issues.
   */
  java.util.List<com.google.cloud.domains.v1.Registration.Issue> getIssuesList();
  /**
   *
   *
   * <pre>
   * Output only. The set of issues with the `Registration` that require attention.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.domains.v1.Registration.Issue issues = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of issues.
   */
  int getIssuesCount();
  /**
   *
   *
   * <pre>
   * Output only. The set of issues with the `Registration` that require attention.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.domains.v1.Registration.Issue issues = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The issues at the given index.
   */
  com.google.cloud.domains.v1.Registration.Issue getIssues(int index);
  /**
   *
   *
   * <pre>
   * Output only. The set of issues with the `Registration` that require attention.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.domains.v1.Registration.Issue issues = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for issues.
   */
  java.util.List<java.lang.Integer> getIssuesValueList();
  /**
   *
   *
   * <pre>
   * Output only. The set of issues with the `Registration` that require attention.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.domains.v1.Registration.Issue issues = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of issues at the given index.
   */
  int getIssuesValue(int index);

  /**
   *
   *
   * <pre>
   * Set of labels associated with the `Registration`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Set of labels associated with the `Registration`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Set of labels associated with the `Registration`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Set of labels associated with the `Registration`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Set of labels associated with the `Registration`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Settings for management of the `Registration`, including renewal, billing,
   * and transfer. You cannot update these with the `UpdateRegistration`
   * method. To update these settings, use the `ConfigureManagementSettings`
   * method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1.ManagementSettings management_settings = 10;</code>
   *
   * @return Whether the managementSettings field is set.
   */
  boolean hasManagementSettings();
  /**
   *
   *
   * <pre>
   * Settings for management of the `Registration`, including renewal, billing,
   * and transfer. You cannot update these with the `UpdateRegistration`
   * method. To update these settings, use the `ConfigureManagementSettings`
   * method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1.ManagementSettings management_settings = 10;</code>
   *
   * @return The managementSettings.
   */
  com.google.cloud.domains.v1.ManagementSettings getManagementSettings();
  /**
   *
   *
   * <pre>
   * Settings for management of the `Registration`, including renewal, billing,
   * and transfer. You cannot update these with the `UpdateRegistration`
   * method. To update these settings, use the `ConfigureManagementSettings`
   * method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1.ManagementSettings management_settings = 10;</code>
   */
  com.google.cloud.domains.v1.ManagementSettingsOrBuilder getManagementSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Settings controlling the DNS configuration of the `Registration`. You
   * cannot update these with the `UpdateRegistration` method. To update these
   * settings, use the `ConfigureDnsSettings` method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1.DnsSettings dns_settings = 11;</code>
   *
   * @return Whether the dnsSettings field is set.
   */
  boolean hasDnsSettings();
  /**
   *
   *
   * <pre>
   * Settings controlling the DNS configuration of the `Registration`. You
   * cannot update these with the `UpdateRegistration` method. To update these
   * settings, use the `ConfigureDnsSettings` method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1.DnsSettings dns_settings = 11;</code>
   *
   * @return The dnsSettings.
   */
  com.google.cloud.domains.v1.DnsSettings getDnsSettings();
  /**
   *
   *
   * <pre>
   * Settings controlling the DNS configuration of the `Registration`. You
   * cannot update these with the `UpdateRegistration` method. To update these
   * settings, use the `ConfigureDnsSettings` method.
   * </pre>
   *
   * <code>.google.cloud.domains.v1.DnsSettings dns_settings = 11;</code>
   */
  com.google.cloud.domains.v1.DnsSettingsOrBuilder getDnsSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Settings for contact information linked to the `Registration`. You cannot
   * update these with the `UpdateRegistration` method. To update these
   * settings, use the `ConfigureContactSettings` method.
   * </pre>
   *
   * <code>
   * .google.cloud.domains.v1.ContactSettings contact_settings = 12 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the contactSettings field is set.
   */
  boolean hasContactSettings();
  /**
   *
   *
   * <pre>
   * Required. Settings for contact information linked to the `Registration`. You cannot
   * update these with the `UpdateRegistration` method. To update these
   * settings, use the `ConfigureContactSettings` method.
   * </pre>
   *
   * <code>
   * .google.cloud.domains.v1.ContactSettings contact_settings = 12 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The contactSettings.
   */
  com.google.cloud.domains.v1.ContactSettings getContactSettings();
  /**
   *
   *
   * <pre>
   * Required. Settings for contact information linked to the `Registration`. You cannot
   * update these with the `UpdateRegistration` method. To update these
   * settings, use the `ConfigureContactSettings` method.
   * </pre>
   *
   * <code>
   * .google.cloud.domains.v1.ContactSettings contact_settings = 12 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.domains.v1.ContactSettingsOrBuilder getContactSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Pending contact settings for the `Registration`. Updates to the
   * `contact_settings` field that change its `registrant_contact` or `privacy`
   * fields require email confirmation by the `registrant_contact`
   * before taking effect. This field is set only if there are pending updates
   * to the `contact_settings` that have not been confirmed. To confirm the
   * changes, the `registrant_contact` must follow the instructions in the
   * email they receive.
   * </pre>
   *
   * <code>
   * .google.cloud.domains.v1.ContactSettings pending_contact_settings = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the pendingContactSettings field is set.
   */
  boolean hasPendingContactSettings();
  /**
   *
   *
   * <pre>
   * Output only. Pending contact settings for the `Registration`. Updates to the
   * `contact_settings` field that change its `registrant_contact` or `privacy`
   * fields require email confirmation by the `registrant_contact`
   * before taking effect. This field is set only if there are pending updates
   * to the `contact_settings` that have not been confirmed. To confirm the
   * changes, the `registrant_contact` must follow the instructions in the
   * email they receive.
   * </pre>
   *
   * <code>
   * .google.cloud.domains.v1.ContactSettings pending_contact_settings = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The pendingContactSettings.
   */
  com.google.cloud.domains.v1.ContactSettings getPendingContactSettings();
  /**
   *
   *
   * <pre>
   * Output only. Pending contact settings for the `Registration`. Updates to the
   * `contact_settings` field that change its `registrant_contact` or `privacy`
   * fields require email confirmation by the `registrant_contact`
   * before taking effect. This field is set only if there are pending updates
   * to the `contact_settings` that have not been confirmed. To confirm the
   * changes, the `registrant_contact` must follow the instructions in the
   * email they receive.
   * </pre>
   *
   * <code>
   * .google.cloud.domains.v1.ContactSettings pending_contact_settings = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.domains.v1.ContactSettingsOrBuilder getPendingContactSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Set of options for the `contact_settings.privacy` field that this
   * `Registration` supports.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.domains.v1.ContactPrivacy supported_privacy = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the supportedPrivacy.
   */
  java.util.List<com.google.cloud.domains.v1.ContactPrivacy> getSupportedPrivacyList();
  /**
   *
   *
   * <pre>
   * Output only. Set of options for the `contact_settings.privacy` field that this
   * `Registration` supports.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.domains.v1.ContactPrivacy supported_privacy = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of supportedPrivacy.
   */
  int getSupportedPrivacyCount();
  /**
   *
   *
   * <pre>
   * Output only. Set of options for the `contact_settings.privacy` field that this
   * `Registration` supports.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.domains.v1.ContactPrivacy supported_privacy = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The supportedPrivacy at the given index.
   */
  com.google.cloud.domains.v1.ContactPrivacy getSupportedPrivacy(int index);
  /**
   *
   *
   * <pre>
   * Output only. Set of options for the `contact_settings.privacy` field that this
   * `Registration` supports.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.domains.v1.ContactPrivacy supported_privacy = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for supportedPrivacy.
   */
  java.util.List<java.lang.Integer> getSupportedPrivacyValueList();
  /**
   *
   *
   * <pre>
   * Output only. Set of options for the `contact_settings.privacy` field that this
   * `Registration` supports.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.domains.v1.ContactPrivacy supported_privacy = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of supportedPrivacy at the given index.
   */
  int getSupportedPrivacyValue(int index);
}
