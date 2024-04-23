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
// source: google/cloud/asset/v1/asset_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.asset.v1;

public interface AnalyzeOrgPolicyGovernedContainersRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.AnalyzeOrgPolicyGovernedContainersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The organization to scope the request. Only organization
   * policies within the scope will be analyzed. The output containers will
   * also be limited to the ones governed by those in-scope organization
   * policies.
   *
   * * organizations/{ORGANIZATION_NUMBER} (e.g., "organizations/123456")
   * </pre>
   *
   * <code>string scope = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The scope.
   */
  java.lang.String getScope();
  /**
   *
   *
   * <pre>
   * Required. The organization to scope the request. Only organization
   * policies within the scope will be analyzed. The output containers will
   * also be limited to the ones governed by those in-scope organization
   * policies.
   *
   * * organizations/{ORGANIZATION_NUMBER} (e.g., "organizations/123456")
   * </pre>
   *
   * <code>string scope = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for scope.
   */
  com.google.protobuf.ByteString getScopeBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of the constraint to analyze governed containers for.
   * The analysis only contains organization policies for the provided
   * constraint.
   * </pre>
   *
   * <code>string constraint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The constraint.
   */
  java.lang.String getConstraint();
  /**
   *
   *
   * <pre>
   * Required. The name of the constraint to analyze governed containers for.
   * The analysis only contains organization policies for the provided
   * constraint.
   * </pre>
   *
   * <code>string constraint = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for constraint.
   */
  com.google.protobuf.ByteString getConstraintBytes();

  /**
   *
   *
   * <pre>
   * The expression to filter
   * [AnalyzeOrgPolicyGovernedContainersResponse.governed_containers][google.cloud.asset.v1.AnalyzeOrgPolicyGovernedContainersResponse.governed_containers].
   * Filtering is currently available for bare literal values and the following
   * fields:
   * * parent
   * * consolidated_policy.rules.enforce
   *
   * When filtering by a specific field, the only supported operator is `=`.
   * For example, filtering by
   * parent="//cloudresourcemanager.googleapis.com/folders/001"
   * will return all the containers under "folders/001".
   * </pre>
   *
   * <code>string filter = 3;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * The expression to filter
   * [AnalyzeOrgPolicyGovernedContainersResponse.governed_containers][google.cloud.asset.v1.AnalyzeOrgPolicyGovernedContainersResponse.governed_containers].
   * Filtering is currently available for bare literal values and the following
   * fields:
   * * parent
   * * consolidated_policy.rules.enforce
   *
   * When filtering by a specific field, the only supported operator is `=`.
   * For example, filtering by
   * parent="//cloudresourcemanager.googleapis.com/folders/001"
   * will return all the containers under "folders/001".
   * </pre>
   *
   * <code>string filter = 3;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of items to return per page. If unspecified,
   * [AnalyzeOrgPolicyGovernedContainersResponse.governed_containers][google.cloud.asset.v1.AnalyzeOrgPolicyGovernedContainersResponse.governed_containers]
   * will contain 100 items with a maximum of 200.
   * </pre>
   *
   * <code>optional int32 page_size = 4;</code>
   *
   * @return Whether the pageSize field is set.
   */
  boolean hasPageSize();
  /**
   *
   *
   * <pre>
   * The maximum number of items to return per page. If unspecified,
   * [AnalyzeOrgPolicyGovernedContainersResponse.governed_containers][google.cloud.asset.v1.AnalyzeOrgPolicyGovernedContainersResponse.governed_containers]
   * will contain 100 items with a maximum of 200.
   * </pre>
   *
   * <code>optional int32 page_size = 4;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The pagination token to retrieve the next page.
   * </pre>
   *
   * <code>string page_token = 5;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The pagination token to retrieve the next page.
   * </pre>
   *
   * <code>string page_token = 5;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
