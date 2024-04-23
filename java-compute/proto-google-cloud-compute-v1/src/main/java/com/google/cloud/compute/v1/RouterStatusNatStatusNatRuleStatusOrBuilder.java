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

public interface RouterStatusNatStatusNatRuleStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RouterStatusNatStatusNatRuleStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of active IPs for NAT. Example: ["1.1.1.1", "179.12.26.133"].
   * </pre>
   *
   * <code>repeated string active_nat_ips = 208517077;</code>
   *
   * @return A list containing the activeNatIps.
   */
  java.util.List<java.lang.String> getActiveNatIpsList();
  /**
   *
   *
   * <pre>
   * A list of active IPs for NAT. Example: ["1.1.1.1", "179.12.26.133"].
   * </pre>
   *
   * <code>repeated string active_nat_ips = 208517077;</code>
   *
   * @return The count of activeNatIps.
   */
  int getActiveNatIpsCount();
  /**
   *
   *
   * <pre>
   * A list of active IPs for NAT. Example: ["1.1.1.1", "179.12.26.133"].
   * </pre>
   *
   * <code>repeated string active_nat_ips = 208517077;</code>
   *
   * @param index The index of the element to return.
   * @return The activeNatIps at the given index.
   */
  java.lang.String getActiveNatIps(int index);
  /**
   *
   *
   * <pre>
   * A list of active IPs for NAT. Example: ["1.1.1.1", "179.12.26.133"].
   * </pre>
   *
   * <code>repeated string active_nat_ips = 208517077;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the activeNatIps at the given index.
   */
  com.google.protobuf.ByteString getActiveNatIpsBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of IPs for NAT that are in drain mode. Example: ["1.1.1.1", "179.12.26.133"].
   * </pre>
   *
   * <code>repeated string drain_nat_ips = 504078535;</code>
   *
   * @return A list containing the drainNatIps.
   */
  java.util.List<java.lang.String> getDrainNatIpsList();
  /**
   *
   *
   * <pre>
   * A list of IPs for NAT that are in drain mode. Example: ["1.1.1.1", "179.12.26.133"].
   * </pre>
   *
   * <code>repeated string drain_nat_ips = 504078535;</code>
   *
   * @return The count of drainNatIps.
   */
  int getDrainNatIpsCount();
  /**
   *
   *
   * <pre>
   * A list of IPs for NAT that are in drain mode. Example: ["1.1.1.1", "179.12.26.133"].
   * </pre>
   *
   * <code>repeated string drain_nat_ips = 504078535;</code>
   *
   * @param index The index of the element to return.
   * @return The drainNatIps at the given index.
   */
  java.lang.String getDrainNatIps(int index);
  /**
   *
   *
   * <pre>
   * A list of IPs for NAT that are in drain mode. Example: ["1.1.1.1", "179.12.26.133"].
   * </pre>
   *
   * <code>repeated string drain_nat_ips = 504078535;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the drainNatIps at the given index.
   */
  com.google.protobuf.ByteString getDrainNatIpsBytes(int index);

  /**
   *
   *
   * <pre>
   * The number of extra IPs to allocate. This will be greater than 0 only if the existing IPs in this NAT Rule are NOT enough to allow all configured VMs to use NAT.
   * </pre>
   *
   * <code>optional int32 min_extra_ips_needed = 353002756;</code>
   *
   * @return Whether the minExtraIpsNeeded field is set.
   */
  boolean hasMinExtraIpsNeeded();
  /**
   *
   *
   * <pre>
   * The number of extra IPs to allocate. This will be greater than 0 only if the existing IPs in this NAT Rule are NOT enough to allow all configured VMs to use NAT.
   * </pre>
   *
   * <code>optional int32 min_extra_ips_needed = 353002756;</code>
   *
   * @return The minExtraIpsNeeded.
   */
  int getMinExtraIpsNeeded();

  /**
   *
   *
   * <pre>
   * Number of VM endpoints (i.e., NICs) that have NAT Mappings from this NAT Rule.
   * </pre>
   *
   * <code>optional int32 num_vm_endpoints_with_nat_mappings = 512367468;</code>
   *
   * @return Whether the numVmEndpointsWithNatMappings field is set.
   */
  boolean hasNumVmEndpointsWithNatMappings();
  /**
   *
   *
   * <pre>
   * Number of VM endpoints (i.e., NICs) that have NAT Mappings from this NAT Rule.
   * </pre>
   *
   * <code>optional int32 num_vm_endpoints_with_nat_mappings = 512367468;</code>
   *
   * @return The numVmEndpointsWithNatMappings.
   */
  int getNumVmEndpointsWithNatMappings();

  /**
   *
   *
   * <pre>
   * Rule number of the rule.
   * </pre>
   *
   * <code>optional int32 rule_number = 535211500;</code>
   *
   * @return Whether the ruleNumber field is set.
   */
  boolean hasRuleNumber();
  /**
   *
   *
   * <pre>
   * Rule number of the rule.
   * </pre>
   *
   * <code>optional int32 rule_number = 535211500;</code>
   *
   * @return The ruleNumber.
   */
  int getRuleNumber();
}
