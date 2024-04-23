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

public interface UsableSubnetworkSecondaryRangeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.UsableSubnetworkSecondaryRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name associated with this subnetwork secondary range, used when adding
   * an alias IP range to a VM instance.
   * </pre>
   *
   * <code>string range_name = 1;</code>
   *
   * @return The rangeName.
   */
  java.lang.String getRangeName();
  /**
   *
   *
   * <pre>
   * The name associated with this subnetwork secondary range, used when adding
   * an alias IP range to a VM instance.
   * </pre>
   *
   * <code>string range_name = 1;</code>
   *
   * @return The bytes for rangeName.
   */
  com.google.protobuf.ByteString getRangeNameBytes();

  /**
   *
   *
   * <pre>
   * The range of IP addresses belonging to this subnetwork secondary range.
   * </pre>
   *
   * <code>string ip_cidr_range = 2;</code>
   *
   * @return The ipCidrRange.
   */
  java.lang.String getIpCidrRange();
  /**
   *
   *
   * <pre>
   * The range of IP addresses belonging to this subnetwork secondary range.
   * </pre>
   *
   * <code>string ip_cidr_range = 2;</code>
   *
   * @return The bytes for ipCidrRange.
   */
  com.google.protobuf.ByteString getIpCidrRangeBytes();

  /**
   *
   *
   * <pre>
   * This field is to determine the status of the secondary range programmably.
   * </pre>
   *
   * <code>.google.container.v1.UsableSubnetworkSecondaryRange.Status status = 3;</code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * This field is to determine the status of the secondary range programmably.
   * </pre>
   *
   * <code>.google.container.v1.UsableSubnetworkSecondaryRange.Status status = 3;</code>
   *
   * @return The status.
   */
  com.google.container.v1.UsableSubnetworkSecondaryRange.Status getStatus();
}
