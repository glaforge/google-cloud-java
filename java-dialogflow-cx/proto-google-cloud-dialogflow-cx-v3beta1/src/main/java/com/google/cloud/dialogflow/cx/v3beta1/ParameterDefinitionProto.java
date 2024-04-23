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
// source: google/cloud/dialogflow/cx/v3beta1/parameter_definition.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.cx.v3beta1;

public final class ParameterDefinitionProto {
  private ParameterDefinitionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ParameterDefinition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ParameterDefinition_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n=google/cloud/dialogflow/cx/v3beta1/par"
          + "ameter_definition.proto\022\"google.cloud.di"
          + "alogflow.cx.v3beta1\032\037google/api/field_be"
          + "havior.proto\"\215\002\n\023ParameterDefinition\022\021\n\004"
          + "name\030\001 \001(\tB\003\340A\002\022X\n\004type\030\002 \001(\0162E.google.c"
          + "loud.dialogflow.cx.v3beta1.ParameterDefi"
          + "nition.ParameterTypeB\003\340A\002\022\023\n\013description"
          + "\030\003 \001(\t\"t\n\rParameterType\022\036\n\032PARAMETER_TYP"
          + "E_UNSPECIFIED\020\000\022\n\n\006STRING\020\001\022\n\n\006NUMBER\020\002\022"
          + "\013\n\007BOOLEAN\020\003\022\010\n\004NULL\020\004\022\n\n\006OBJECT\020\005\022\010\n\004LI"
          + "ST\020\006B\322\001\n&com.google.cloud.dialogflow.cx."
          + "v3beta1B\030ParameterDefinitionProtoP\001Z6clo"
          + "ud.google.com/go/dialogflow/cx/apiv3beta"
          + "1/cxpb;cxpb\370\001\001\242\002\002DF\252\002\"Google.Cloud.Dialo"
          + "gflow.Cx.V3Beta1\352\002&Google::Cloud::Dialog"
          + "flow::CX::V3beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ParameterDefinition_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ParameterDefinition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ParameterDefinition_descriptor,
            new java.lang.String[] {
              "Name", "Type", "Description",
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
