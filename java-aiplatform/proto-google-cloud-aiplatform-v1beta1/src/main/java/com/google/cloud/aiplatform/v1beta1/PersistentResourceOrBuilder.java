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
// source: google/cloud/aiplatform/v1beta1/persistent_resource.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public interface PersistentResourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.PersistentResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. Resource name of a PersistentResource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. Resource name of a PersistentResource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The display name of the PersistentResource.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. The display name of the PersistentResource.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The spec of the pools of different resources.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ResourcePool resource_pools = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.ResourcePool> getResourcePoolsList();
  /**
   *
   *
   * <pre>
   * Required. The spec of the pools of different resources.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ResourcePool resource_pools = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ResourcePool getResourcePools(int index);
  /**
   *
   *
   * <pre>
   * Required. The spec of the pools of different resources.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ResourcePool resource_pools = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getResourcePoolsCount();
  /**
   *
   *
   * <pre>
   * Required. The spec of the pools of different resources.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ResourcePool resource_pools = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ResourcePoolOrBuilder>
      getResourcePoolsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The spec of the pools of different resources.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ResourcePool resource_pools = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ResourcePoolOrBuilder getResourcePoolsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The detailed state of a Study.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PersistentResource.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The detailed state of a Study.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PersistentResource.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.aiplatform.v1beta1.PersistentResource.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Only populated when persistent resource's state is `STOPPING`
   * or `ERROR`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Output only. Only populated when persistent resource's state is `STOPPING`
   * or `ERROR`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Output only. Only populated when persistent resource's state is `STOPPING`
   * or `ERROR`.
   * </pre>
   *
   * <code>.google.rpc.Status error = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when the PersistentResource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the PersistentResource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the PersistentResource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when the PersistentResource for the first time entered
   * the `RUNNING` state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the PersistentResource for the first time entered
   * the `RUNNING` state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the PersistentResource for the first time entered
   * the `RUNNING` state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when the PersistentResource was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the PersistentResource was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the PersistentResource was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize
   * PersistentResource.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize
   * PersistentResource.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize
   * PersistentResource.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata to organize
   * PersistentResource.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. The labels with user-defined metadata to organize
   * PersistentResource.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. The full name of the Compute Engine
   * [network](/compute/docs/networks-and-firewalls#networks) to peered with
   * Vertex AI to host the persistent resources.
   * For example, `projects/12345/global/networks/myVPC`.
   * [Format](/compute/docs/reference/rest/v1/networks/insert)
   * is of the form `projects/{project}/global/networks/{network}`.
   * Where {project} is a project number, as in `12345`, and {network} is a
   * network name.
   *
   * To specify this field, you must have already [configured VPC Network
   * Peering for Vertex
   * AI](https://cloud.google.com/vertex-ai/docs/general/vpc-peering).
   *
   * If this field is left unspecified, the resources aren't peered with any
   * network.
   * </pre>
   *
   * <code>
   * string network = 11 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Optional. The full name of the Compute Engine
   * [network](/compute/docs/networks-and-firewalls#networks) to peered with
   * Vertex AI to host the persistent resources.
   * For example, `projects/12345/global/networks/myVPC`.
   * [Format](/compute/docs/reference/rest/v1/networks/insert)
   * is of the form `projects/{project}/global/networks/{network}`.
   * Where {project} is a project number, as in `12345`, and {network} is a
   * network name.
   *
   * To specify this field, you must have already [configured VPC Network
   * Peering for Vertex
   * AI](https://cloud.google.com/vertex-ai/docs/general/vpc-peering).
   *
   * If this field is left unspecified, the resources aren't peered with any
   * network.
   * </pre>
   *
   * <code>
   * string network = 11 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Optional. Customer-managed encryption key spec for a PersistentResource.
   * If set, this PersistentResource and all sub-resources of this
   * PersistentResource will be secured by this key.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the encryptionSpec field is set.
   */
  boolean hasEncryptionSpec();
  /**
   *
   *
   * <pre>
   * Optional. Customer-managed encryption key spec for a PersistentResource.
   * If set, this PersistentResource and all sub-resources of this
   * PersistentResource will be secured by this key.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The encryptionSpec.
   */
  com.google.cloud.aiplatform.v1beta1.EncryptionSpec getEncryptionSpec();
  /**
   *
   *
   * <pre>
   * Optional. Customer-managed encryption key spec for a PersistentResource.
   * If set, this PersistentResource and all sub-resources of this
   * PersistentResource will be secured by this key.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.EncryptionSpecOrBuilder getEncryptionSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Persistent Resource runtime spec.
   * For example, used for Ray cluster configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ResourceRuntimeSpec resource_runtime_spec = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the resourceRuntimeSpec field is set.
   */
  boolean hasResourceRuntimeSpec();
  /**
   *
   *
   * <pre>
   * Optional. Persistent Resource runtime spec.
   * For example, used for Ray cluster configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ResourceRuntimeSpec resource_runtime_spec = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The resourceRuntimeSpec.
   */
  com.google.cloud.aiplatform.v1beta1.ResourceRuntimeSpec getResourceRuntimeSpec();
  /**
   *
   *
   * <pre>
   * Optional. Persistent Resource runtime spec.
   * For example, used for Ray cluster configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ResourceRuntimeSpec resource_runtime_spec = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ResourceRuntimeSpecOrBuilder
      getResourceRuntimeSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Runtime information of the Persistent Resource.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ResourceRuntime resource_runtime = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the resourceRuntime field is set.
   */
  boolean hasResourceRuntime();
  /**
   *
   *
   * <pre>
   * Output only. Runtime information of the Persistent Resource.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ResourceRuntime resource_runtime = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The resourceRuntime.
   */
  com.google.cloud.aiplatform.v1beta1.ResourceRuntime getResourceRuntime();
  /**
   *
   *
   * <pre>
   * Output only. Runtime information of the Persistent Resource.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ResourceRuntime resource_runtime = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ResourceRuntimeOrBuilder getResourceRuntimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A list of names for the reserved IP ranges under the VPC network
   * that can be used for this persistent resource.
   *
   * If set, we will deploy the persistent resource within the provided IP
   * ranges. Otherwise, the persistent resource is deployed to any IP
   * ranges under the provided VPC network.
   *
   * Example: ['vertex-ai-ip-range'].
   * </pre>
   *
   * <code>repeated string reserved_ip_ranges = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the reservedIpRanges.
   */
  java.util.List<java.lang.String> getReservedIpRangesList();
  /**
   *
   *
   * <pre>
   * Optional. A list of names for the reserved IP ranges under the VPC network
   * that can be used for this persistent resource.
   *
   * If set, we will deploy the persistent resource within the provided IP
   * ranges. Otherwise, the persistent resource is deployed to any IP
   * ranges under the provided VPC network.
   *
   * Example: ['vertex-ai-ip-range'].
   * </pre>
   *
   * <code>repeated string reserved_ip_ranges = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of reservedIpRanges.
   */
  int getReservedIpRangesCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of names for the reserved IP ranges under the VPC network
   * that can be used for this persistent resource.
   *
   * If set, we will deploy the persistent resource within the provided IP
   * ranges. Otherwise, the persistent resource is deployed to any IP
   * ranges under the provided VPC network.
   *
   * Example: ['vertex-ai-ip-range'].
   * </pre>
   *
   * <code>repeated string reserved_ip_ranges = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The reservedIpRanges at the given index.
   */
  java.lang.String getReservedIpRanges(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of names for the reserved IP ranges under the VPC network
   * that can be used for this persistent resource.
   *
   * If set, we will deploy the persistent resource within the provided IP
   * ranges. Otherwise, the persistent resource is deployed to any IP
   * ranges under the provided VPC network.
   *
   * Example: ['vertex-ai-ip-range'].
   * </pre>
   *
   * <code>repeated string reserved_ip_ranges = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the reservedIpRanges at the given index.
   */
  com.google.protobuf.ByteString getReservedIpRangesBytes(int index);
}
