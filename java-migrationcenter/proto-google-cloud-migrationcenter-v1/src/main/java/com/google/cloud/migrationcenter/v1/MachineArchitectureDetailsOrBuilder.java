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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.migrationcenter.v1;

public interface MachineArchitectureDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.MachineArchitectureDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * CPU architecture, e.g., "x64-based PC", "x86_64", "i686" etc.
   * </pre>
   *
   * <code>string cpu_architecture = 1;</code>
   *
   * @return The cpuArchitecture.
   */
  java.lang.String getCpuArchitecture();
  /**
   *
   *
   * <pre>
   * CPU architecture, e.g., "x64-based PC", "x86_64", "i686" etc.
   * </pre>
   *
   * <code>string cpu_architecture = 1;</code>
   *
   * @return The bytes for cpuArchitecture.
   */
  com.google.protobuf.ByteString getCpuArchitectureBytes();

  /**
   *
   *
   * <pre>
   * CPU name, e.g., "Intel Xeon E5-2690", "AMD EPYC 7571" etc.
   * </pre>
   *
   * <code>string cpu_name = 2;</code>
   *
   * @return The cpuName.
   */
  java.lang.String getCpuName();
  /**
   *
   *
   * <pre>
   * CPU name, e.g., "Intel Xeon E5-2690", "AMD EPYC 7571" etc.
   * </pre>
   *
   * <code>string cpu_name = 2;</code>
   *
   * @return The bytes for cpuName.
   */
  com.google.protobuf.ByteString getCpuNameBytes();

  /**
   *
   *
   * <pre>
   * Hardware vendor.
   * </pre>
   *
   * <code>string vendor = 3;</code>
   *
   * @return The vendor.
   */
  java.lang.String getVendor();
  /**
   *
   *
   * <pre>
   * Hardware vendor.
   * </pre>
   *
   * <code>string vendor = 3;</code>
   *
   * @return The bytes for vendor.
   */
  com.google.protobuf.ByteString getVendorBytes();

  /**
   *
   *
   * <pre>
   * Number of CPU threads allocated to the machine.
   * </pre>
   *
   * <code>int32 cpu_thread_count = 4;</code>
   *
   * @return The cpuThreadCount.
   */
  int getCpuThreadCount();

  /**
   *
   *
   * <pre>
   * Number of processor sockets allocated to the machine.
   * </pre>
   *
   * <code>int32 cpu_socket_count = 5;</code>
   *
   * @return The cpuSocketCount.
   */
  int getCpuSocketCount();

  /**
   *
   *
   * <pre>
   * BIOS Details.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.BiosDetails bios = 6;</code>
   *
   * @return Whether the bios field is set.
   */
  boolean hasBios();
  /**
   *
   *
   * <pre>
   * BIOS Details.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.BiosDetails bios = 6;</code>
   *
   * @return The bios.
   */
  com.google.cloud.migrationcenter.v1.BiosDetails getBios();
  /**
   *
   *
   * <pre>
   * BIOS Details.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.BiosDetails bios = 6;</code>
   */
  com.google.cloud.migrationcenter.v1.BiosDetailsOrBuilder getBiosOrBuilder();

  /**
   *
   *
   * <pre>
   * Firmware type.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.MachineArchitectureDetails.FirmwareType firmware_type = 7;
   * </code>
   *
   * @return The enum numeric value on the wire for firmwareType.
   */
  int getFirmwareTypeValue();
  /**
   *
   *
   * <pre>
   * Firmware type.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.MachineArchitectureDetails.FirmwareType firmware_type = 7;
   * </code>
   *
   * @return The firmwareType.
   */
  com.google.cloud.migrationcenter.v1.MachineArchitectureDetails.FirmwareType getFirmwareType();

  /**
   *
   *
   * <pre>
   * CPU hyper-threading support.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.MachineArchitectureDetails.CpuHyperThreading hyperthreading = 8;
   * </code>
   *
   * @return The enum numeric value on the wire for hyperthreading.
   */
  int getHyperthreadingValue();
  /**
   *
   *
   * <pre>
   * CPU hyper-threading support.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.MachineArchitectureDetails.CpuHyperThreading hyperthreading = 8;
   * </code>
   *
   * @return The hyperthreading.
   */
  com.google.cloud.migrationcenter.v1.MachineArchitectureDetails.CpuHyperThreading
      getHyperthreading();
}
