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

public interface SourceInstancePropertiesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SourceInstanceProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Enables instances created based on this machine image to send packets with source IP addresses other than their own and receive packets with destination IP addresses other than their own. If these instances will be used as an IP gateway or it will be set as the next-hop in a Route resource, specify true. If unsure, leave this set to false. See the Enable IP forwarding documentation for more information.
   * </pre>
   *
   * <code>optional bool can_ip_forward = 467731324;</code>
   *
   * @return Whether the canIpForward field is set.
   */
  boolean hasCanIpForward();
  /**
   *
   *
   * <pre>
   * Enables instances created based on this machine image to send packets with source IP addresses other than their own and receive packets with destination IP addresses other than their own. If these instances will be used as an IP gateway or it will be set as the next-hop in a Route resource, specify true. If unsure, leave this set to false. See the Enable IP forwarding documentation for more information.
   * </pre>
   *
   * <code>optional bool can_ip_forward = 467731324;</code>
   *
   * @return The canIpForward.
   */
  boolean getCanIpForward();

  /**
   *
   *
   * <pre>
   * Whether the instance created from this machine image should be protected against deletion.
   * </pre>
   *
   * <code>optional bool deletion_protection = 458014698;</code>
   *
   * @return Whether the deletionProtection field is set.
   */
  boolean hasDeletionProtection();
  /**
   *
   *
   * <pre>
   * Whether the instance created from this machine image should be protected against deletion.
   * </pre>
   *
   * <code>optional bool deletion_protection = 458014698;</code>
   *
   * @return The deletionProtection.
   */
  boolean getDeletionProtection();

  /**
   *
   *
   * <pre>
   * An optional text description for the instances that are created from this machine image.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * An optional text description for the instances that are created from this machine image.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional text description for the instances that are created from this machine image.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * An array of disks that are associated with the instances that are created from this machine image.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.SavedAttachedDisk disks = 95594102;</code>
   */
  java.util.List<com.google.cloud.compute.v1.SavedAttachedDisk> getDisksList();
  /**
   *
   *
   * <pre>
   * An array of disks that are associated with the instances that are created from this machine image.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.SavedAttachedDisk disks = 95594102;</code>
   */
  com.google.cloud.compute.v1.SavedAttachedDisk getDisks(int index);
  /**
   *
   *
   * <pre>
   * An array of disks that are associated with the instances that are created from this machine image.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.SavedAttachedDisk disks = 95594102;</code>
   */
  int getDisksCount();
  /**
   *
   *
   * <pre>
   * An array of disks that are associated with the instances that are created from this machine image.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.SavedAttachedDisk disks = 95594102;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.SavedAttachedDiskOrBuilder>
      getDisksOrBuilderList();
  /**
   *
   *
   * <pre>
   * An array of disks that are associated with the instances that are created from this machine image.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.SavedAttachedDisk disks = 95594102;</code>
   */
  com.google.cloud.compute.v1.SavedAttachedDiskOrBuilder getDisksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A list of guest accelerator cards' type and count to use for instances created from this machine image.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.AcceleratorConfig> getGuestAcceleratorsList();
  /**
   *
   *
   * <pre>
   * A list of guest accelerator cards' type and count to use for instances created from this machine image.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
   * </code>
   */
  com.google.cloud.compute.v1.AcceleratorConfig getGuestAccelerators(int index);
  /**
   *
   *
   * <pre>
   * A list of guest accelerator cards' type and count to use for instances created from this machine image.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
   * </code>
   */
  int getGuestAcceleratorsCount();
  /**
   *
   *
   * <pre>
   * A list of guest accelerator cards' type and count to use for instances created from this machine image.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.AcceleratorConfigOrBuilder>
      getGuestAcceleratorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of guest accelerator cards' type and count to use for instances created from this machine image.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
   * </code>
   */
  com.google.cloud.compute.v1.AcceleratorConfigOrBuilder getGuestAcceleratorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * KeyRevocationActionType of the instance. Supported options are "STOP" and "NONE". The default value is "NONE" if it is not specified.
   * Check the KeyRevocationActionType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string key_revocation_action_type = 235941474;</code>
   *
   * @return Whether the keyRevocationActionType field is set.
   */
  boolean hasKeyRevocationActionType();
  /**
   *
   *
   * <pre>
   * KeyRevocationActionType of the instance. Supported options are "STOP" and "NONE". The default value is "NONE" if it is not specified.
   * Check the KeyRevocationActionType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string key_revocation_action_type = 235941474;</code>
   *
   * @return The keyRevocationActionType.
   */
  java.lang.String getKeyRevocationActionType();
  /**
   *
   *
   * <pre>
   * KeyRevocationActionType of the instance. Supported options are "STOP" and "NONE". The default value is "NONE" if it is not specified.
   * Check the KeyRevocationActionType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string key_revocation_action_type = 235941474;</code>
   *
   * @return The bytes for keyRevocationActionType.
   */
  com.google.protobuf.ByteString getKeyRevocationActionTypeBytes();

  /**
   *
   *
   * <pre>
   * Labels to apply to instances that are created from this machine image.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels to apply to instances that are created from this machine image.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels to apply to instances that are created from this machine image.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels to apply to instances that are created from this machine image.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
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
   * Labels to apply to instances that are created from this machine image.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The machine type to use for instances that are created from this machine image.
   * </pre>
   *
   * <code>optional string machine_type = 227711026;</code>
   *
   * @return Whether the machineType field is set.
   */
  boolean hasMachineType();
  /**
   *
   *
   * <pre>
   * The machine type to use for instances that are created from this machine image.
   * </pre>
   *
   * <code>optional string machine_type = 227711026;</code>
   *
   * @return The machineType.
   */
  java.lang.String getMachineType();
  /**
   *
   *
   * <pre>
   * The machine type to use for instances that are created from this machine image.
   * </pre>
   *
   * <code>optional string machine_type = 227711026;</code>
   *
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString getMachineTypeBytes();

  /**
   *
   *
   * <pre>
   * The metadata key/value pairs to assign to instances that are created from this machine image. These pairs can consist of custom metadata or predefined keys. See Project and instance metadata for more information.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Metadata metadata = 86866735;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * The metadata key/value pairs to assign to instances that are created from this machine image. These pairs can consist of custom metadata or predefined keys. See Project and instance metadata for more information.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Metadata metadata = 86866735;</code>
   *
   * @return The metadata.
   */
  com.google.cloud.compute.v1.Metadata getMetadata();
  /**
   *
   *
   * <pre>
   * The metadata key/value pairs to assign to instances that are created from this machine image. These pairs can consist of custom metadata or predefined keys. See Project and instance metadata for more information.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Metadata metadata = 86866735;</code>
   */
  com.google.cloud.compute.v1.MetadataOrBuilder getMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Minimum cpu/platform to be used by instances created from this machine image. The instance may be scheduled on the specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge". For more information, read Specifying a Minimum CPU Platform.
   * </pre>
   *
   * <code>optional string min_cpu_platform = 242912759;</code>
   *
   * @return Whether the minCpuPlatform field is set.
   */
  boolean hasMinCpuPlatform();
  /**
   *
   *
   * <pre>
   * Minimum cpu/platform to be used by instances created from this machine image. The instance may be scheduled on the specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge". For more information, read Specifying a Minimum CPU Platform.
   * </pre>
   *
   * <code>optional string min_cpu_platform = 242912759;</code>
   *
   * @return The minCpuPlatform.
   */
  java.lang.String getMinCpuPlatform();
  /**
   *
   *
   * <pre>
   * Minimum cpu/platform to be used by instances created from this machine image. The instance may be scheduled on the specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge". For more information, read Specifying a Minimum CPU Platform.
   * </pre>
   *
   * <code>optional string min_cpu_platform = 242912759;</code>
   *
   * @return The bytes for minCpuPlatform.
   */
  com.google.protobuf.ByteString getMinCpuPlatformBytes();

  /**
   *
   *
   * <pre>
   * An array of network access configurations for this interface.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkInterface network_interfaces = 52735243;</code>
   */
  java.util.List<com.google.cloud.compute.v1.NetworkInterface> getNetworkInterfacesList();
  /**
   *
   *
   * <pre>
   * An array of network access configurations for this interface.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkInterface network_interfaces = 52735243;</code>
   */
  com.google.cloud.compute.v1.NetworkInterface getNetworkInterfaces(int index);
  /**
   *
   *
   * <pre>
   * An array of network access configurations for this interface.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkInterface network_interfaces = 52735243;</code>
   */
  int getNetworkInterfacesCount();
  /**
   *
   *
   * <pre>
   * An array of network access configurations for this interface.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkInterface network_interfaces = 52735243;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.NetworkInterfaceOrBuilder>
      getNetworkInterfacesOrBuilderList();
  /**
   *
   *
   * <pre>
   * An array of network access configurations for this interface.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NetworkInterface network_interfaces = 52735243;</code>
   */
  com.google.cloud.compute.v1.NetworkInterfaceOrBuilder getNetworkInterfacesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Specifies the scheduling options for the instances that are created from this machine image.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Scheduling scheduling = 386688404;</code>
   *
   * @return Whether the scheduling field is set.
   */
  boolean hasScheduling();
  /**
   *
   *
   * <pre>
   * Specifies the scheduling options for the instances that are created from this machine image.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Scheduling scheduling = 386688404;</code>
   *
   * @return The scheduling.
   */
  com.google.cloud.compute.v1.Scheduling getScheduling();
  /**
   *
   *
   * <pre>
   * Specifies the scheduling options for the instances that are created from this machine image.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Scheduling scheduling = 386688404;</code>
   */
  com.google.cloud.compute.v1.SchedulingOrBuilder getSchedulingOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from this machine image. Use metadata queries to obtain the access tokens for these instances.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ServiceAccount service_accounts = 277537328;</code>
   */
  java.util.List<com.google.cloud.compute.v1.ServiceAccount> getServiceAccountsList();
  /**
   *
   *
   * <pre>
   * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from this machine image. Use metadata queries to obtain the access tokens for these instances.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ServiceAccount service_accounts = 277537328;</code>
   */
  com.google.cloud.compute.v1.ServiceAccount getServiceAccounts(int index);
  /**
   *
   *
   * <pre>
   * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from this machine image. Use metadata queries to obtain the access tokens for these instances.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ServiceAccount service_accounts = 277537328;</code>
   */
  int getServiceAccountsCount();
  /**
   *
   *
   * <pre>
   * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from this machine image. Use metadata queries to obtain the access tokens for these instances.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ServiceAccount service_accounts = 277537328;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.ServiceAccountOrBuilder>
      getServiceAccountsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from this machine image. Use metadata queries to obtain the access tokens for these instances.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.ServiceAccount service_accounts = 277537328;</code>
   */
  com.google.cloud.compute.v1.ServiceAccountOrBuilder getServiceAccountsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A list of tags to apply to the instances that are created from this machine image. The tags identify valid sources or targets for network firewalls. The setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Tags tags = 3552281;</code>
   *
   * @return Whether the tags field is set.
   */
  boolean hasTags();
  /**
   *
   *
   * <pre>
   * A list of tags to apply to the instances that are created from this machine image. The tags identify valid sources or targets for network firewalls. The setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Tags tags = 3552281;</code>
   *
   * @return The tags.
   */
  com.google.cloud.compute.v1.Tags getTags();
  /**
   *
   *
   * <pre>
   * A list of tags to apply to the instances that are created from this machine image. The tags identify valid sources or targets for network firewalls. The setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Tags tags = 3552281;</code>
   */
  com.google.cloud.compute.v1.TagsOrBuilder getTagsOrBuilder();
}
