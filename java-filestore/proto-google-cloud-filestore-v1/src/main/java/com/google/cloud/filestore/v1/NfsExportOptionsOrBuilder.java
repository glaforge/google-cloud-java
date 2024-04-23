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
// source: google/cloud/filestore/v1/cloud_filestore_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.filestore.v1;

public interface NfsExportOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.filestore.v1.NfsExportOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of either an IPv4 addresses in the format
   * `{octet1}.{octet2}.{octet3}.{octet4}` or CIDR ranges in the format
   * `{octet1}.{octet2}.{octet3}.{octet4}/{mask size}` which may mount the
   * file share.
   * Overlapping IP ranges are not allowed, both within and across
   * NfsExportOptions. An error will be returned.
   * The limit is 64 IP ranges/addresses for each FileShareConfig among all
   * NfsExportOptions.
   * </pre>
   *
   * <code>repeated string ip_ranges = 1;</code>
   *
   * @return A list containing the ipRanges.
   */
  java.util.List<java.lang.String> getIpRangesList();
  /**
   *
   *
   * <pre>
   * List of either an IPv4 addresses in the format
   * `{octet1}.{octet2}.{octet3}.{octet4}` or CIDR ranges in the format
   * `{octet1}.{octet2}.{octet3}.{octet4}/{mask size}` which may mount the
   * file share.
   * Overlapping IP ranges are not allowed, both within and across
   * NfsExportOptions. An error will be returned.
   * The limit is 64 IP ranges/addresses for each FileShareConfig among all
   * NfsExportOptions.
   * </pre>
   *
   * <code>repeated string ip_ranges = 1;</code>
   *
   * @return The count of ipRanges.
   */
  int getIpRangesCount();
  /**
   *
   *
   * <pre>
   * List of either an IPv4 addresses in the format
   * `{octet1}.{octet2}.{octet3}.{octet4}` or CIDR ranges in the format
   * `{octet1}.{octet2}.{octet3}.{octet4}/{mask size}` which may mount the
   * file share.
   * Overlapping IP ranges are not allowed, both within and across
   * NfsExportOptions. An error will be returned.
   * The limit is 64 IP ranges/addresses for each FileShareConfig among all
   * NfsExportOptions.
   * </pre>
   *
   * <code>repeated string ip_ranges = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The ipRanges at the given index.
   */
  java.lang.String getIpRanges(int index);
  /**
   *
   *
   * <pre>
   * List of either an IPv4 addresses in the format
   * `{octet1}.{octet2}.{octet3}.{octet4}` or CIDR ranges in the format
   * `{octet1}.{octet2}.{octet3}.{octet4}/{mask size}` which may mount the
   * file share.
   * Overlapping IP ranges are not allowed, both within and across
   * NfsExportOptions. An error will be returned.
   * The limit is 64 IP ranges/addresses for each FileShareConfig among all
   * NfsExportOptions.
   * </pre>
   *
   * <code>repeated string ip_ranges = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the ipRanges at the given index.
   */
  com.google.protobuf.ByteString getIpRangesBytes(int index);

  /**
   *
   *
   * <pre>
   * Either READ_ONLY, for allowing only read requests on the exported
   * directory, or READ_WRITE, for allowing both read and write requests.
   * The default is READ_WRITE.
   * </pre>
   *
   * <code>.google.cloud.filestore.v1.NfsExportOptions.AccessMode access_mode = 2;</code>
   *
   * @return The enum numeric value on the wire for accessMode.
   */
  int getAccessModeValue();
  /**
   *
   *
   * <pre>
   * Either READ_ONLY, for allowing only read requests on the exported
   * directory, or READ_WRITE, for allowing both read and write requests.
   * The default is READ_WRITE.
   * </pre>
   *
   * <code>.google.cloud.filestore.v1.NfsExportOptions.AccessMode access_mode = 2;</code>
   *
   * @return The accessMode.
   */
  com.google.cloud.filestore.v1.NfsExportOptions.AccessMode getAccessMode();

  /**
   *
   *
   * <pre>
   * Either NO_ROOT_SQUASH, for allowing root access on the exported directory,
   * or ROOT_SQUASH, for not allowing root access. The default is
   * NO_ROOT_SQUASH.
   * </pre>
   *
   * <code>.google.cloud.filestore.v1.NfsExportOptions.SquashMode squash_mode = 3;</code>
   *
   * @return The enum numeric value on the wire for squashMode.
   */
  int getSquashModeValue();
  /**
   *
   *
   * <pre>
   * Either NO_ROOT_SQUASH, for allowing root access on the exported directory,
   * or ROOT_SQUASH, for not allowing root access. The default is
   * NO_ROOT_SQUASH.
   * </pre>
   *
   * <code>.google.cloud.filestore.v1.NfsExportOptions.SquashMode squash_mode = 3;</code>
   *
   * @return The squashMode.
   */
  com.google.cloud.filestore.v1.NfsExportOptions.SquashMode getSquashMode();

  /**
   *
   *
   * <pre>
   * An integer representing the anonymous user id with a default value of
   * 65534.
   * Anon_uid may only be set with squash_mode of ROOT_SQUASH.  An error will be
   * returned if this field is specified for other squash_mode settings.
   * </pre>
   *
   * <code>int64 anon_uid = 4;</code>
   *
   * @return The anonUid.
   */
  long getAnonUid();

  /**
   *
   *
   * <pre>
   * An integer representing the anonymous group id with a default value of
   * 65534.
   * Anon_gid may only be set with squash_mode of ROOT_SQUASH.  An error will be
   * returned if this field is specified for other squash_mode settings.
   * </pre>
   *
   * <code>int64 anon_gid = 5;</code>
   *
   * @return The anonGid.
   */
  long getAnonGid();
}
