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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.3
package com.google.container.v1;

public interface NetworkConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.NetworkConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [network][google.container.v1.NetworkConfig.network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks)
   * to which the cluster is connected. Example:
   * projects/my-project/global/networks/my-network
   * </pre>
   *
   * <code>string network = 1;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [network][google.container.v1.NetworkConfig.network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks)
   * to which the cluster is connected. Example:
   * projects/my-project/global/networks/my-network
   * </pre>
   *
   * <code>string network = 1;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [subnetwork](https://cloud.google.com/compute/docs/vpc) to which the
   * cluster is connected. Example:
   * projects/my-project/regions/us-central1/subnetworks/my-subnet
   * </pre>
   *
   * <code>string subnetwork = 2;</code>
   *
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();
  /**
   *
   *
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [subnetwork](https://cloud.google.com/compute/docs/vpc) to which the
   * cluster is connected. Example:
   * projects/my-project/regions/us-central1/subnetworks/my-subnet
   * </pre>
   *
   * <code>string subnetwork = 2;</code>
   *
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString getSubnetworkBytes();

  /**
   *
   *
   * <pre>
   * Whether Intra-node visibility is enabled for this cluster.
   * This makes same node pod to pod traffic visible for VPC network.
   * </pre>
   *
   * <code>bool enable_intra_node_visibility = 5;</code>
   *
   * @return The enableIntraNodeVisibility.
   */
  boolean getEnableIntraNodeVisibility();

  /**
   *
   *
   * <pre>
   * Whether the cluster disables default in-node sNAT rules. In-node sNAT rules
   * will be disabled when default_snat_status is disabled. When disabled is set
   * to false, default IP masquerade rules will be applied to the nodes to
   * prevent sNAT on cluster internal traffic.
   * </pre>
   *
   * <code>.google.container.v1.DefaultSnatStatus default_snat_status = 7;</code>
   *
   * @return Whether the defaultSnatStatus field is set.
   */
  boolean hasDefaultSnatStatus();
  /**
   *
   *
   * <pre>
   * Whether the cluster disables default in-node sNAT rules. In-node sNAT rules
   * will be disabled when default_snat_status is disabled. When disabled is set
   * to false, default IP masquerade rules will be applied to the nodes to
   * prevent sNAT on cluster internal traffic.
   * </pre>
   *
   * <code>.google.container.v1.DefaultSnatStatus default_snat_status = 7;</code>
   *
   * @return The defaultSnatStatus.
   */
  com.google.container.v1.DefaultSnatStatus getDefaultSnatStatus();
  /**
   *
   *
   * <pre>
   * Whether the cluster disables default in-node sNAT rules. In-node sNAT rules
   * will be disabled when default_snat_status is disabled. When disabled is set
   * to false, default IP masquerade rules will be applied to the nodes to
   * prevent sNAT on cluster internal traffic.
   * </pre>
   *
   * <code>.google.container.v1.DefaultSnatStatus default_snat_status = 7;</code>
   */
  com.google.container.v1.DefaultSnatStatusOrBuilder getDefaultSnatStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether L4ILB Subsetting is enabled for this cluster.
   * </pre>
   *
   * <code>bool enable_l4ilb_subsetting = 10;</code>
   *
   * @return The enableL4ilbSubsetting.
   */
  boolean getEnableL4IlbSubsetting();

  /**
   *
   *
   * <pre>
   * The desired datapath provider for this cluster. By default, uses the
   * IPTables-based kube-proxy implementation.
   * </pre>
   *
   * <code>.google.container.v1.DatapathProvider datapath_provider = 11;</code>
   *
   * @return The enum numeric value on the wire for datapathProvider.
   */
  int getDatapathProviderValue();
  /**
   *
   *
   * <pre>
   * The desired datapath provider for this cluster. By default, uses the
   * IPTables-based kube-proxy implementation.
   * </pre>
   *
   * <code>.google.container.v1.DatapathProvider datapath_provider = 11;</code>
   *
   * @return The datapathProvider.
   */
  com.google.container.v1.DatapathProvider getDatapathProvider();

  /**
   *
   *
   * <pre>
   * The desired state of IPv6 connectivity to Google Services.
   * By default, no private IPv6 access to or from Google Services (all access
   * will be via IPv4)
   * </pre>
   *
   * <code>.google.container.v1.PrivateIPv6GoogleAccess private_ipv6_google_access = 12;</code>
   *
   * @return The enum numeric value on the wire for privateIpv6GoogleAccess.
   */
  int getPrivateIpv6GoogleAccessValue();
  /**
   *
   *
   * <pre>
   * The desired state of IPv6 connectivity to Google Services.
   * By default, no private IPv6 access to or from Google Services (all access
   * will be via IPv4)
   * </pre>
   *
   * <code>.google.container.v1.PrivateIPv6GoogleAccess private_ipv6_google_access = 12;</code>
   *
   * @return The privateIpv6GoogleAccess.
   */
  com.google.container.v1.PrivateIPv6GoogleAccess getPrivateIpv6GoogleAccess();

  /**
   *
   *
   * <pre>
   * DNSConfig contains clusterDNS config for this cluster.
   * </pre>
   *
   * <code>.google.container.v1.DNSConfig dns_config = 13;</code>
   *
   * @return Whether the dnsConfig field is set.
   */
  boolean hasDnsConfig();
  /**
   *
   *
   * <pre>
   * DNSConfig contains clusterDNS config for this cluster.
   * </pre>
   *
   * <code>.google.container.v1.DNSConfig dns_config = 13;</code>
   *
   * @return The dnsConfig.
   */
  com.google.container.v1.DNSConfig getDnsConfig();
  /**
   *
   *
   * <pre>
   * DNSConfig contains clusterDNS config for this cluster.
   * </pre>
   *
   * <code>.google.container.v1.DNSConfig dns_config = 13;</code>
   */
  com.google.container.v1.DNSConfigOrBuilder getDnsConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * ServiceExternalIPsConfig specifies if services with externalIPs field are
   * blocked or not.
   * </pre>
   *
   * <code>.google.container.v1.ServiceExternalIPsConfig service_external_ips_config = 15;</code>
   *
   * @return Whether the serviceExternalIpsConfig field is set.
   */
  boolean hasServiceExternalIpsConfig();
  /**
   *
   *
   * <pre>
   * ServiceExternalIPsConfig specifies if services with externalIPs field are
   * blocked or not.
   * </pre>
   *
   * <code>.google.container.v1.ServiceExternalIPsConfig service_external_ips_config = 15;</code>
   *
   * @return The serviceExternalIpsConfig.
   */
  com.google.container.v1.ServiceExternalIPsConfig getServiceExternalIpsConfig();
  /**
   *
   *
   * <pre>
   * ServiceExternalIPsConfig specifies if services with externalIPs field are
   * blocked or not.
   * </pre>
   *
   * <code>.google.container.v1.ServiceExternalIPsConfig service_external_ips_config = 15;</code>
   */
  com.google.container.v1.ServiceExternalIPsConfigOrBuilder getServiceExternalIpsConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * GatewayAPIConfig contains the desired config of Gateway API on this
   * cluster.
   * </pre>
   *
   * <code>.google.container.v1.GatewayAPIConfig gateway_api_config = 16;</code>
   *
   * @return Whether the gatewayApiConfig field is set.
   */
  boolean hasGatewayApiConfig();
  /**
   *
   *
   * <pre>
   * GatewayAPIConfig contains the desired config of Gateway API on this
   * cluster.
   * </pre>
   *
   * <code>.google.container.v1.GatewayAPIConfig gateway_api_config = 16;</code>
   *
   * @return The gatewayApiConfig.
   */
  com.google.container.v1.GatewayAPIConfig getGatewayApiConfig();
  /**
   *
   *
   * <pre>
   * GatewayAPIConfig contains the desired config of Gateway API on this
   * cluster.
   * </pre>
   *
   * <code>.google.container.v1.GatewayAPIConfig gateway_api_config = 16;</code>
   */
  com.google.container.v1.GatewayAPIConfigOrBuilder getGatewayApiConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether multi-networking is enabled for this cluster.
   * </pre>
   *
   * <code>bool enable_multi_networking = 17;</code>
   *
   * @return The enableMultiNetworking.
   */
  boolean getEnableMultiNetworking();

  /**
   *
   *
   * <pre>
   * Network bandwidth tier configuration.
   * </pre>
   *
   * <code>
   * .google.container.v1.NetworkConfig.ClusterNetworkPerformanceConfig network_performance_config = 18;
   * </code>
   *
   * @return Whether the networkPerformanceConfig field is set.
   */
  boolean hasNetworkPerformanceConfig();
  /**
   *
   *
   * <pre>
   * Network bandwidth tier configuration.
   * </pre>
   *
   * <code>
   * .google.container.v1.NetworkConfig.ClusterNetworkPerformanceConfig network_performance_config = 18;
   * </code>
   *
   * @return The networkPerformanceConfig.
   */
  com.google.container.v1.NetworkConfig.ClusterNetworkPerformanceConfig
      getNetworkPerformanceConfig();
  /**
   *
   *
   * <pre>
   * Network bandwidth tier configuration.
   * </pre>
   *
   * <code>
   * .google.container.v1.NetworkConfig.ClusterNetworkPerformanceConfig network_performance_config = 18;
   * </code>
   */
  com.google.container.v1.NetworkConfig.ClusterNetworkPerformanceConfigOrBuilder
      getNetworkPerformanceConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether FQDN Network Policy is enabled on this cluster.
   * </pre>
   *
   * <code>optional bool enable_fqdn_network_policy = 19;</code>
   *
   * @return Whether the enableFqdnNetworkPolicy field is set.
   */
  boolean hasEnableFqdnNetworkPolicy();
  /**
   *
   *
   * <pre>
   * Whether FQDN Network Policy is enabled on this cluster.
   * </pre>
   *
   * <code>optional bool enable_fqdn_network_policy = 19;</code>
   *
   * @return The enableFqdnNetworkPolicy.
   */
  boolean getEnableFqdnNetworkPolicy();

  /**
   *
   *
   * <pre>
   * Specify the details of in-transit encryption.
   * </pre>
   *
   * <code>
   * optional .google.container.v1.InTransitEncryptionConfig in_transit_encryption_config = 20;
   * </code>
   *
   * @return Whether the inTransitEncryptionConfig field is set.
   */
  boolean hasInTransitEncryptionConfig();
  /**
   *
   *
   * <pre>
   * Specify the details of in-transit encryption.
   * </pre>
   *
   * <code>
   * optional .google.container.v1.InTransitEncryptionConfig in_transit_encryption_config = 20;
   * </code>
   *
   * @return The enum numeric value on the wire for inTransitEncryptionConfig.
   */
  int getInTransitEncryptionConfigValue();
  /**
   *
   *
   * <pre>
   * Specify the details of in-transit encryption.
   * </pre>
   *
   * <code>
   * optional .google.container.v1.InTransitEncryptionConfig in_transit_encryption_config = 20;
   * </code>
   *
   * @return The inTransitEncryptionConfig.
   */
  com.google.container.v1.InTransitEncryptionConfig getInTransitEncryptionConfig();

  /**
   *
   *
   * <pre>
   * Whether CiliumClusterwideNetworkPolicy is enabled on this cluster.
   * </pre>
   *
   * <code>optional bool enable_cilium_clusterwide_network_policy = 21;</code>
   *
   * @return Whether the enableCiliumClusterwideNetworkPolicy field is set.
   */
  boolean hasEnableCiliumClusterwideNetworkPolicy();
  /**
   *
   *
   * <pre>
   * Whether CiliumClusterwideNetworkPolicy is enabled on this cluster.
   * </pre>
   *
   * <code>optional bool enable_cilium_clusterwide_network_policy = 21;</code>
   *
   * @return The enableCiliumClusterwideNetworkPolicy.
   */
  boolean getEnableCiliumClusterwideNetworkPolicy();
}
