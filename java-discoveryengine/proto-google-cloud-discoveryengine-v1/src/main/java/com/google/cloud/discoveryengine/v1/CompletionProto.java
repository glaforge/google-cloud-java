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
// source: google/cloud/discoveryengine/v1/completion.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1;

public final class CompletionProto {
  private CompletionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_SuggestionDenyListEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_SuggestionDenyListEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/discoveryengine/v1/comple"
          + "tion.proto\022\037google.cloud.discoveryengine"
          + ".v1\032\037google/api/field_behavior.proto\"\351\001\n"
          + "\027SuggestionDenyListEntry\022\031\n\014block_phrase"
          + "\030\001 \001(\tB\003\340A\002\022c\n\016match_operator\030\002 \001(\0162F.go"
          + "ogle.cloud.discoveryengine.v1.Suggestion"
          + "DenyListEntry.MatchOperatorB\003\340A\002\"N\n\rMatc"
          + "hOperator\022\036\n\032MATCH_OPERATOR_UNSPECIFIED\020"
          + "\000\022\017\n\013EXACT_MATCH\020\001\022\014\n\010CONTAINS\020\002B\202\002\n#com"
          + ".google.cloud.discoveryengine.v1B\017Comple"
          + "tionProtoP\001ZMcloud.google.com/go/discove"
          + "ryengine/apiv1/discoveryenginepb;discove"
          + "ryenginepb\242\002\017DISCOVERYENGINE\252\002\037Google.Cl"
          + "oud.DiscoveryEngine.V1\312\002\037Google\\Cloud\\Di"
          + "scoveryEngine\\V1\352\002\"Google::Cloud::Discov"
          + "eryEngine::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1_SuggestionDenyListEntry_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_SuggestionDenyListEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_SuggestionDenyListEntry_descriptor,
            new java.lang.String[] {
              "BlockPhrase", "MatchOperator",
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
