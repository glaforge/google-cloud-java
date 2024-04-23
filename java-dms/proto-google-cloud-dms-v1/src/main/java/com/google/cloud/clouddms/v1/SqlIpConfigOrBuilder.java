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
// source: google/cloud/clouddms/v1/clouddms_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.clouddms.v1;

public interface SqlIpConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.SqlIpConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether the instance should be assigned an IPv4 address or not.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_ipv4 = 1;</code>
   *
   * @return Whether the enableIpv4 field is set.
   */
  boolean hasEnableIpv4();
  /**
   *
   *
   * <pre>
   * Whether the instance should be assigned an IPv4 address or not.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_ipv4 = 1;</code>
   *
   * @return The enableIpv4.
   */
  com.google.protobuf.BoolValue getEnableIpv4();
  /**
   *
   *
   * <pre>
   * Whether the instance should be assigned an IPv4 address or not.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_ipv4 = 1;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getEnableIpv4OrBuilder();

  /**
   *
   *
   * <pre>
   * The resource link for the VPC network from which the Cloud SQL instance is
   * accessible for private IP. For example,
   * `projects/myProject/global/networks/default`. This setting can
   * be updated, but it cannot be removed after it is set.
   * </pre>
   *
   * <code>string private_network = 2;</code>
   *
   * @return The privateNetwork.
   */
  java.lang.String getPrivateNetwork();
  /**
   *
   *
   * <pre>
   * The resource link for the VPC network from which the Cloud SQL instance is
   * accessible for private IP. For example,
   * `projects/myProject/global/networks/default`. This setting can
   * be updated, but it cannot be removed after it is set.
   * </pre>
   *
   * <code>string private_network = 2;</code>
   *
   * @return The bytes for privateNetwork.
   */
  com.google.protobuf.ByteString getPrivateNetworkBytes();

  /**
   *
   *
   * <pre>
   * Optional. The name of the allocated IP address range for the private IP
   * Cloud SQL instance. This name refers to an already allocated IP range
   * address. If set, the instance IP address will be created in the allocated
   * range. Note that this IP address range can't be modified after the instance
   * is created. If you change the VPC when configuring connectivity settings
   * for the migration job, this field is not relevant.
   * </pre>
   *
   * <code>string allocated_ip_range = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The allocatedIpRange.
   */
  java.lang.String getAllocatedIpRange();
  /**
   *
   *
   * <pre>
   * Optional. The name of the allocated IP address range for the private IP
   * Cloud SQL instance. This name refers to an already allocated IP range
   * address. If set, the instance IP address will be created in the allocated
   * range. Note that this IP address range can't be modified after the instance
   * is created. If you change the VPC when configuring connectivity settings
   * for the migration job, this field is not relevant.
   * </pre>
   *
   * <code>string allocated_ip_range = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for allocatedIpRange.
   */
  com.google.protobuf.ByteString getAllocatedIpRangeBytes();

  /**
   *
   *
   * <pre>
   * Whether SSL connections over IP should be enforced or not.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue require_ssl = 3;</code>
   *
   * @return Whether the requireSsl field is set.
   */
  boolean hasRequireSsl();
  /**
   *
   *
   * <pre>
   * Whether SSL connections over IP should be enforced or not.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue require_ssl = 3;</code>
   *
   * @return The requireSsl.
   */
  com.google.protobuf.BoolValue getRequireSsl();
  /**
   *
   *
   * <pre>
   * Whether SSL connections over IP should be enforced or not.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue require_ssl = 3;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getRequireSslOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of external networks that are allowed to connect to the instance
   * using the IP. See
   * https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as
   * 'slash' notation (e.g. `192.168.100.0/24`).
   * </pre>
   *
   * <code>repeated .google.cloud.clouddms.v1.SqlAclEntry authorized_networks = 4;</code>
   */
  java.util.List<com.google.cloud.clouddms.v1.SqlAclEntry> getAuthorizedNetworksList();
  /**
   *
   *
   * <pre>
   * The list of external networks that are allowed to connect to the instance
   * using the IP. See
   * https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as
   * 'slash' notation (e.g. `192.168.100.0/24`).
   * </pre>
   *
   * <code>repeated .google.cloud.clouddms.v1.SqlAclEntry authorized_networks = 4;</code>
   */
  com.google.cloud.clouddms.v1.SqlAclEntry getAuthorizedNetworks(int index);
  /**
   *
   *
   * <pre>
   * The list of external networks that are allowed to connect to the instance
   * using the IP. See
   * https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as
   * 'slash' notation (e.g. `192.168.100.0/24`).
   * </pre>
   *
   * <code>repeated .google.cloud.clouddms.v1.SqlAclEntry authorized_networks = 4;</code>
   */
  int getAuthorizedNetworksCount();
  /**
   *
   *
   * <pre>
   * The list of external networks that are allowed to connect to the instance
   * using the IP. See
   * https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as
   * 'slash' notation (e.g. `192.168.100.0/24`).
   * </pre>
   *
   * <code>repeated .google.cloud.clouddms.v1.SqlAclEntry authorized_networks = 4;</code>
   */
  java.util.List<? extends com.google.cloud.clouddms.v1.SqlAclEntryOrBuilder>
      getAuthorizedNetworksOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of external networks that are allowed to connect to the instance
   * using the IP. See
   * https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as
   * 'slash' notation (e.g. `192.168.100.0/24`).
   * </pre>
   *
   * <code>repeated .google.cloud.clouddms.v1.SqlAclEntry authorized_networks = 4;</code>
   */
  com.google.cloud.clouddms.v1.SqlAclEntryOrBuilder getAuthorizedNetworksOrBuilder(int index);
}
