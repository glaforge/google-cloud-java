/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/deployment_resource_pool.proto

package com.google.cloud.aiplatform.v1beta1;

public final class DeploymentResourcePoolProto {
  private DeploymentResourcePoolProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeploymentResourcePool_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeploymentResourcePool_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n>google/cloud/aiplatform/v1beta1/deploy"
          + "ment_resource_pool.proto\022\037google.cloud.a"
          + "iplatform.v1beta1\032\037google/api/field_beha"
          + "vior.proto\032\031google/api/resource.proto\0327g"
          + "oogle/cloud/aiplatform/v1beta1/machine_r"
          + "esources.proto\032\037google/protobuf/timestam"
          + "p.proto\"\315\002\n\026DeploymentResourcePool\022\021\n\004na"
          + "me\030\001 \001(\tB\003\340A\003\022U\n\023dedicated_resources\030\002 \001"
          + "(\01323.google.cloud.aiplatform.v1beta1.Ded"
          + "icatedResourcesB\003\340A\002\0224\n\013create_time\030\004 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003:\222\001\352A\216"
          + "\001\n0aiplatform.googleapis.com/DeploymentR"
          + "esourcePool\022Zprojects/{project}/location"
          + "s/{location}/deploymentResourcePools/{de"
          + "ployment_resource_pool}B\370\001\n#com.google.c"
          + "loud.aiplatform.v1beta1B\033DeploymentResou"
          + "rcePoolProtoP\001ZIgoogle.golang.org/genpro"
          + "to/googleapis/cloud/aiplatform/v1beta1;a"
          + "iplatform\252\002\037Google.Cloud.AIPlatform.V1Be"
          + "ta1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\""
          + "Google::Cloud::AIPlatform::V1beta1b\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeploymentResourcePool_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_DeploymentResourcePool_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeploymentResourcePool_descriptor,
            new java.lang.String[] {
              "Name", "DedicatedResources", "CreateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
