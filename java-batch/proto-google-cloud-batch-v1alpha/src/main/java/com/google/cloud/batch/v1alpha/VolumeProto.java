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
// source: google/cloud/batch/v1alpha/volume.proto

package com.google.cloud.batch.v1alpha;

public final class VolumeProto {
  private VolumeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Volume_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Volume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_NFS_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_NFS_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_PD_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_PD_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_GCS_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_GCS_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/batch/v1alpha/volume.prot"
          + "o\022\032google.cloud.batch.v1alpha\"\346\001\n\006Volume"
          + "\022.\n\003nfs\030\001 \001(\0132\037.google.cloud.batch.v1alp"
          + "ha.NFSH\000\0220\n\002pd\030\002 \001(\0132\036.google.cloud.batc"
          + "h.v1alpha.PDB\002\030\001H\000\022.\n\003gcs\030\003 \001(\0132\037.google"
          + ".cloud.batch.v1alpha.GCSH\000\022\025\n\013device_nam"
          + "e\030\006 \001(\tH\000\022\022\n\nmount_path\030\004 \001(\t\022\025\n\rmount_o"
          + "ptions\030\005 \003(\tB\010\n\006source\"*\n\003NFS\022\016\n\006server\030"
          + "\001 \001(\t\022\023\n\013remote_path\030\002 \001(\t\"8\n\002PD\022\014\n\004disk"
          + "\030\001 \001(\t\022\016\n\006device\030\002 \001(\t\022\024\n\010existing\030\003 \001(\010"
          + "B\002\030\001\"\032\n\003GCS\022\023\n\013remote_path\030\001 \001(\tB\305\001\n\036com"
          + ".google.cloud.batch.v1alphaB\013VolumeProto"
          + "P\001Z4cloud.google.com/go/batch/apiv1alpha"
          + "/batchpb;batchpb\242\002\003GCB\252\002\032Google.Cloud.Ba"
          + "tch.V1Alpha\312\002\032Google\\Cloud\\Batch\\V1alpha"
          + "\352\002\035Google::Cloud::Batch::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_batch_v1alpha_Volume_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_Volume_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Volume_descriptor,
            new java.lang.String[] {
              "Nfs", "Pd", "Gcs", "DeviceName", "MountPath", "MountOptions", "Source",
            });
    internal_static_google_cloud_batch_v1alpha_NFS_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_batch_v1alpha_NFS_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_NFS_descriptor,
            new java.lang.String[] {
              "Server", "RemotePath",
            });
    internal_static_google_cloud_batch_v1alpha_PD_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_batch_v1alpha_PD_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_PD_descriptor,
            new java.lang.String[] {
              "Disk", "Device", "Existing",
            });
    internal_static_google_cloud_batch_v1alpha_GCS_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_batch_v1alpha_GCS_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_GCS_descriptor,
            new java.lang.String[] {
              "RemotePath",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
