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
// source: google/cloud/notebooks/v2/gce_setup.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.notebooks.v2;

public final class GceSetupProto {
  private GceSetupProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v2_NetworkInterface_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v2_NetworkInterface_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v2_VmImage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v2_VmImage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v2_ContainerImage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v2_ContainerImage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v2_AcceleratorConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v2_AcceleratorConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v2_ShieldedInstanceConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v2_ShieldedInstanceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v2_GPUDriverConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v2_GPUDriverConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v2_DataDisk_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v2_DataDisk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v2_BootDisk_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v2_BootDisk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v2_ServiceAccount_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v2_ServiceAccount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v2_GceSetup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v2_GceSetup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v2_GceSetup_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v2_GceSetup_MetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/notebooks/v2/gce_setup.pr"
          + "oto\022\031google.cloud.notebooks.v2\032\037google/a"
          + "pi/field_behavior.proto\"\311\001\n\020NetworkInter"
          + "face\022\024\n\007network\030\001 \001(\tB\003\340A\001\022\023\n\006subnet\030\002 \001"
          + "(\tB\003\340A\001\022J\n\010nic_type\030\003 \001(\01623.google.cloud"
          + ".notebooks.v2.NetworkInterface.NicTypeB\003"
          + "\340A\001\">\n\007NicType\022\030\n\024NIC_TYPE_UNSPECIFIED\020\000"
          + "\022\016\n\nVIRTIO_NET\020\001\022\t\n\005GVNIC\020\002\"T\n\007VmImage\022\024"
          + "\n\007project\030\001 \001(\tB\003\340A\002\022\023\n\004name\030\002 \001(\tB\003\340A\001H"
          + "\000\022\025\n\006family\030\003 \001(\tB\003\340A\001H\000B\007\n\005image\";\n\016Con"
          + "tainerImage\022\027\n\nrepository\030\001 \001(\tB\003\340A\002\022\020\n\003"
          + "tag\030\002 \001(\tB\003\340A\001\"\224\003\n\021AcceleratorConfig\022O\n\004"
          + "type\030\001 \001(\0162<.google.cloud.notebooks.v2.A"
          + "cceleratorConfig.AcceleratorTypeB\003\340A\001\022\027\n"
          + "\ncore_count\030\002 \001(\003B\003\340A\001\"\224\002\n\017AcceleratorTy"
          + "pe\022 \n\034ACCELERATOR_TYPE_UNSPECIFIED\020\000\022\025\n\021"
          + "NVIDIA_TESLA_P100\020\002\022\025\n\021NVIDIA_TESLA_V100"
          + "\020\003\022\023\n\017NVIDIA_TESLA_P4\020\004\022\023\n\017NVIDIA_TESLA_"
          + "T4\020\005\022\025\n\021NVIDIA_TESLA_A100\020\013\022\024\n\020NVIDIA_A1"
          + "00_80GB\020\014\022\r\n\tNVIDIA_L4\020\r\022\027\n\023NVIDIA_TESLA"
          + "_T4_VWS\020\010\022\031\n\025NVIDIA_TESLA_P100_VWS\020\t\022\027\n\023"
          + "NVIDIA_TESLA_P4_VWS\020\n\"}\n\026ShieldedInstanc"
          + "eConfig\022\037\n\022enable_secure_boot\030\001 \001(\010B\003\340A\001"
          + "\022\030\n\013enable_vtpm\030\002 \001(\010B\003\340A\001\022(\n\033enable_int"
          + "egrity_monitoring\030\003 \001(\010B\003\340A\001\"V\n\017GPUDrive"
          + "rConfig\022\036\n\021enable_gpu_driver\030\001 \001(\010B\003\340A\001\022"
          + "#\n\026custom_gpu_driver_path\030\002 \001(\tB\003\340A\001\"\312\001\n"
          + "\010DataDisk\022\031\n\014disk_size_gb\030\001 \001(\003B\003\340A\001\022>\n\t"
          + "disk_type\030\002 \001(\0162#.google.cloud.notebooks"
          + ".v2.DiskTypeB\006\340A\004\340A\001\022J\n\017disk_encryption\030"
          + "\005 \001(\0162).google.cloud.notebooks.v2.DiskEn"
          + "cryptionB\006\340A\004\340A\001\022\027\n\007kms_key\030\006 \001(\tB\006\340A\004\340A"
          + "\001\"\307\001\n\010BootDisk\022\031\n\014disk_size_gb\030\001 \001(\003B\003\340A"
          + "\001\022;\n\tdisk_type\030\002 \001(\0162#.google.cloud.note"
          + "books.v2.DiskTypeB\003\340A\001\022J\n\017disk_encryptio"
          + "n\030\003 \001(\0162).google.cloud.notebooks.v2.Disk"
          + "EncryptionB\006\340A\004\340A\001\022\027\n\007kms_key\030\004 \001(\tB\006\340A\004"
          + "\340A\001\"9\n\016ServiceAccount\022\022\n\005email\030\001 \001(\tB\003\340A"
          + "\001\022\023\n\006scopes\030\002 \003(\tB\003\340A\003\"\220\007\n\010GceSetup\022\031\n\014m"
          + "achine_type\030\001 \001(\tB\003\340A\001\022N\n\023accelerator_co"
          + "nfigs\030\002 \003(\0132,.google.cloud.notebooks.v2."
          + "AcceleratorConfigB\003\340A\001\022H\n\020service_accoun"
          + "ts\030\003 \003(\0132).google.cloud.notebooks.v2.Ser"
          + "viceAccountB\003\340A\001\022;\n\010vm_image\030\004 \001(\0132\".goo"
          + "gle.cloud.notebooks.v2.VmImageB\003\340A\001H\000\022I\n"
          + "\017container_image\030\005 \001(\0132).google.cloud.no"
          + "tebooks.v2.ContainerImageB\003\340A\001H\000\022;\n\tboot"
          + "_disk\030\006 \001(\0132#.google.cloud.notebooks.v2."
          + "BootDiskB\003\340A\001\022<\n\ndata_disks\030\007 \003(\0132#.goog"
          + "le.cloud.notebooks.v2.DataDiskB\003\340A\001\022X\n\030s"
          + "hielded_instance_config\030\010 \001(\01321.google.c"
          + "loud.notebooks.v2.ShieldedInstanceConfig"
          + "B\003\340A\001\022L\n\022network_interfaces\030\t \003(\0132+.goog"
          + "le.cloud.notebooks.v2.NetworkInterfaceB\003"
          + "\340A\001\022\036\n\021disable_public_ip\030\n \001(\010B\003\340A\001\022\021\n\004t"
          + "ags\030\013 \003(\tB\003\340A\001\022H\n\010metadata\030\014 \003(\01321.googl"
          + "e.cloud.notebooks.v2.GceSetup.MetadataEn"
          + "tryB\003\340A\001\022!\n\024enable_ip_forwarding\030\r \001(\010B\003"
          + "\340A\001\022J\n\021gpu_driver_config\030\016 \001(\0132*.google."
          + "cloud.notebooks.v2.GPUDriverConfigB\003\340A\001\032"
          + "/\n\rMetadataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002"
          + " \001(\t:\0028\001B\007\n\005image*E\n\016DiskEncryption\022\037\n\033D"
          + "ISK_ENCRYPTION_UNSPECIFIED\020\000\022\010\n\004GMEK\020\001\022\010"
          + "\n\004CMEK\020\002*c\n\010DiskType\022\031\n\025DISK_TYPE_UNSPEC"
          + "IFIED\020\000\022\017\n\013PD_STANDARD\020\001\022\n\n\006PD_SSD\020\002\022\017\n\013"
          + "PD_BALANCED\020\003\022\016\n\nPD_EXTREME\020\004B\304\001\n\035com.go"
          + "ogle.cloud.notebooks.v2B\rGceSetupProtoP\001"
          + "Z;cloud.google.com/go/notebooks/apiv2/no"
          + "tebookspb;notebookspb\252\002\031Google.Cloud.Not"
          + "ebooks.V2\312\002\031Google\\Cloud\\Notebooks\\V2\352\002\034"
          + "Google::Cloud::Notebooks::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_notebooks_v2_NetworkInterface_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_notebooks_v2_NetworkInterface_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v2_NetworkInterface_descriptor,
            new java.lang.String[] {
              "Network", "Subnet", "NicType",
            });
    internal_static_google_cloud_notebooks_v2_VmImage_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_notebooks_v2_VmImage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v2_VmImage_descriptor,
            new java.lang.String[] {
              "Project", "Name", "Family", "Image",
            });
    internal_static_google_cloud_notebooks_v2_ContainerImage_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_notebooks_v2_ContainerImage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v2_ContainerImage_descriptor,
            new java.lang.String[] {
              "Repository", "Tag",
            });
    internal_static_google_cloud_notebooks_v2_AcceleratorConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_notebooks_v2_AcceleratorConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v2_AcceleratorConfig_descriptor,
            new java.lang.String[] {
              "Type", "CoreCount",
            });
    internal_static_google_cloud_notebooks_v2_ShieldedInstanceConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_notebooks_v2_ShieldedInstanceConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v2_ShieldedInstanceConfig_descriptor,
            new java.lang.String[] {
              "EnableSecureBoot", "EnableVtpm", "EnableIntegrityMonitoring",
            });
    internal_static_google_cloud_notebooks_v2_GPUDriverConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_notebooks_v2_GPUDriverConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v2_GPUDriverConfig_descriptor,
            new java.lang.String[] {
              "EnableGpuDriver", "CustomGpuDriverPath",
            });
    internal_static_google_cloud_notebooks_v2_DataDisk_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_notebooks_v2_DataDisk_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v2_DataDisk_descriptor,
            new java.lang.String[] {
              "DiskSizeGb", "DiskType", "DiskEncryption", "KmsKey",
            });
    internal_static_google_cloud_notebooks_v2_BootDisk_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_notebooks_v2_BootDisk_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v2_BootDisk_descriptor,
            new java.lang.String[] {
              "DiskSizeGb", "DiskType", "DiskEncryption", "KmsKey",
            });
    internal_static_google_cloud_notebooks_v2_ServiceAccount_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_notebooks_v2_ServiceAccount_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v2_ServiceAccount_descriptor,
            new java.lang.String[] {
              "Email", "Scopes",
            });
    internal_static_google_cloud_notebooks_v2_GceSetup_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_notebooks_v2_GceSetup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v2_GceSetup_descriptor,
            new java.lang.String[] {
              "MachineType",
              "AcceleratorConfigs",
              "ServiceAccounts",
              "VmImage",
              "ContainerImage",
              "BootDisk",
              "DataDisks",
              "ShieldedInstanceConfig",
              "NetworkInterfaces",
              "DisablePublicIp",
              "Tags",
              "Metadata",
              "EnableIpForwarding",
              "GpuDriverConfig",
              "Image",
            });
    internal_static_google_cloud_notebooks_v2_GceSetup_MetadataEntry_descriptor =
        internal_static_google_cloud_notebooks_v2_GceSetup_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_notebooks_v2_GceSetup_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v2_GceSetup_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
