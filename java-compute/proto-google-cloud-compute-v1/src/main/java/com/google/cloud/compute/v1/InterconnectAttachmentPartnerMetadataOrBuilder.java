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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.compute.v1;

public interface InterconnectAttachmentPartnerMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>optional string interconnect_name = 514963356;</code>
   *
   * @return Whether the interconnectName field is set.
   */
  boolean hasInterconnectName();
  /**
   *
   *
   * <pre>
   * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>optional string interconnect_name = 514963356;</code>
   *
   * @return The interconnectName.
   */
  java.lang.String getInterconnectName();
  /**
   *
   *
   * <pre>
   * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>optional string interconnect_name = 514963356;</code>
   *
   * @return The bytes for interconnectName.
   */
  com.google.protobuf.ByteString getInterconnectNameBytes();

  /**
   *
   *
   * <pre>
   * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>optional string partner_name = 161747874;</code>
   *
   * @return Whether the partnerName field is set.
   */
  boolean hasPartnerName();
  /**
   *
   *
   * <pre>
   * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>optional string partner_name = 161747874;</code>
   *
   * @return The partnerName.
   */
  java.lang.String getPartnerName();
  /**
   *
   *
   * <pre>
   * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>optional string partner_name = 161747874;</code>
   *
   * @return The bytes for partnerName.
   */
  com.google.protobuf.ByteString getPartnerNameBytes();

  /**
   *
   *
   * <pre>
   * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>optional string portal_url = 269182748;</code>
   *
   * @return Whether the portalUrl field is set.
   */
  boolean hasPortalUrl();
  /**
   *
   *
   * <pre>
   * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>optional string portal_url = 269182748;</code>
   *
   * @return The portalUrl.
   */
  java.lang.String getPortalUrl();
  /**
   *
   *
   * <pre>
   * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>optional string portal_url = 269182748;</code>
   *
   * @return The bytes for portalUrl.
   */
  com.google.protobuf.ByteString getPortalUrlBytes();
}
