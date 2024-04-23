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

public interface InstancesGetEffectiveFirewallsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstancesGetEffectiveFirewallsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Effective firewalls from firewall policies.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy firewall_policys = 410985794;
   * </code>
   */
  java.util.List<
          com.google.cloud.compute.v1.InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy>
      getFirewallPolicysList();
  /**
   *
   *
   * <pre>
   * Effective firewalls from firewall policies.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy firewall_policys = 410985794;
   * </code>
   */
  com.google.cloud.compute.v1.InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy
      getFirewallPolicys(int index);
  /**
   *
   *
   * <pre>
   * Effective firewalls from firewall policies.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy firewall_policys = 410985794;
   * </code>
   */
  int getFirewallPolicysCount();
  /**
   *
   *
   * <pre>
   * Effective firewalls from firewall policies.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy firewall_policys = 410985794;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.compute.v1
                  .InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicyOrBuilder>
      getFirewallPolicysOrBuilderList();
  /**
   *
   *
   * <pre>
   * Effective firewalls from firewall policies.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicy firewall_policys = 410985794;
   * </code>
   */
  com.google.cloud.compute.v1.InstancesGetEffectiveFirewallsResponseEffectiveFirewallPolicyOrBuilder
      getFirewallPolicysOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Effective firewalls on the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Firewall firewalls = 272245619;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Firewall> getFirewallsList();
  /**
   *
   *
   * <pre>
   * Effective firewalls on the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Firewall firewalls = 272245619;</code>
   */
  com.google.cloud.compute.v1.Firewall getFirewalls(int index);
  /**
   *
   *
   * <pre>
   * Effective firewalls on the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Firewall firewalls = 272245619;</code>
   */
  int getFirewallsCount();
  /**
   *
   *
   * <pre>
   * Effective firewalls on the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Firewall firewalls = 272245619;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.FirewallOrBuilder>
      getFirewallsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Effective firewalls on the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Firewall firewalls = 272245619;</code>
   */
  com.google.cloud.compute.v1.FirewallOrBuilder getFirewallsOrBuilder(int index);
}
