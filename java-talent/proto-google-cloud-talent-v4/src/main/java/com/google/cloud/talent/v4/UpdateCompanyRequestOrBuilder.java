/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/talent/v4/company_service.proto

package com.google.cloud.talent.v4;

public interface UpdateCompanyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4.UpdateCompanyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The company resource to replace the current resource in the system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.Company company = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the company field is set.
   */
  boolean hasCompany();
  /**
   *
   *
   * <pre>
   * Required. The company resource to replace the current resource in the system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.Company company = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The company.
   */
  com.google.cloud.talent.v4.Company getCompany();
  /**
   *
   *
   * <pre>
   * Required. The company resource to replace the current resource in the system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.Company company = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.talent.v4.CompanyOrBuilder getCompanyOrBuilder();

  /**
   *
   *
   * <pre>
   * Strongly recommended for the best service experience.
   * If [update_mask][google.cloud.talent.v4.UpdateCompanyRequest.update_mask] is provided, only the specified fields in
   * [company][google.cloud.talent.v4.UpdateCompanyRequest.company] are updated. Otherwise all the fields are updated.
   * A field mask to specify the company fields to be updated. Only
   * top level fields of [Company][google.cloud.talent.v4.Company] are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Strongly recommended for the best service experience.
   * If [update_mask][google.cloud.talent.v4.UpdateCompanyRequest.update_mask] is provided, only the specified fields in
   * [company][google.cloud.talent.v4.UpdateCompanyRequest.company] are updated. Otherwise all the fields are updated.
   * A field mask to specify the company fields to be updated. Only
   * top level fields of [Company][google.cloud.talent.v4.Company] are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Strongly recommended for the best service experience.
   * If [update_mask][google.cloud.talent.v4.UpdateCompanyRequest.update_mask] is provided, only the specified fields in
   * [company][google.cloud.talent.v4.UpdateCompanyRequest.company] are updated. Otherwise all the fields are updated.
   * A field mask to specify the company fields to be updated. Only
   * top level fields of [Company][google.cloud.talent.v4.Company] are supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}