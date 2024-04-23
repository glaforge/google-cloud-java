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
// source: google/cloud/aiplatform/v1/deployment_resource_pool.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public final class DeploymentResourcePoolProto {
  private DeploymentResourcePoolProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeploymentResourcePool_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeploymentResourcePool_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/aiplatform/v1/deployment_"
          + "resource_pool.proto\022\032google.cloud.aiplat"
          + "form.v1\032\037google/api/field_behavior.proto"
          + "\032\031google/api/resource.proto\0322google/clou"
          + "d/aiplatform/v1/machine_resources.proto\032"
          + "\037google/protobuf/timestamp.proto\"\310\002\n\026Dep"
          + "loymentResourcePool\022\021\n\004name\030\001 \001(\tB\003\340A\005\022P"
          + "\n\023dedicated_resources\030\002 \001(\0132..google.clo"
          + "ud.aiplatform.v1.DedicatedResourcesB\003\340A\002"
          + "\0224\n\013create_time\030\004 \001(\0132\032.google.protobuf."
          + "TimestampB\003\340A\003:\222\001\352A\216\001\n0aiplatform.google"
          + "apis.com/DeploymentResourcePool\022Zproject"
          + "s/{project}/locations/{location}/deploym"
          + "entResourcePools/{deployment_resource_po"
          + "ol}B\331\001\n\036com.google.cloud.aiplatform.v1B\033"
          + "DeploymentResourcePoolProtoP\001Z>cloud.goo"
          + "gle.com/go/aiplatform/apiv1/aiplatformpb"
          + ";aiplatformpb\252\002\032Google.Cloud.AIPlatform."
          + "V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google"
          + "::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_DeploymentResourcePool_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_DeploymentResourcePool_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeploymentResourcePool_descriptor,
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
    com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
