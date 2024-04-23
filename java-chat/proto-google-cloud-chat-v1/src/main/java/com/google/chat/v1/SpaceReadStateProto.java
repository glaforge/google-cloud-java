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
// source: google/chat/v1/space_read_state.proto

// Protobuf Java Version: 3.25.3
package com.google.chat.v1;

public final class SpaceReadStateProto {
  private SpaceReadStateProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_SpaceReadState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_SpaceReadState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_GetSpaceReadStateRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_GetSpaceReadStateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_UpdateSpaceReadStateRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_UpdateSpaceReadStateRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/chat/v1/space_read_state.proto\022"
          + "\016google.chat.v1\032\037google/api/field_behavi"
          + "or.proto\032\031google/api/resource.proto\032 goo"
          + "gle/protobuf/field_mask.proto\032\037google/pr"
          + "otobuf/timestamp.proto\"\274\001\n\016SpaceReadStat"
          + "e\022\014\n\004name\030\001 \001(\t\0227\n\016last_read_time\030\002 \001(\0132"
          + "\032.google.protobuf.TimestampB\003\340A\001:c\352A`\n\"c"
          + "hat.googleapis.com/SpaceReadState\022*users"
          + "/{user}/spaces/{space}/spaceReadState2\016s"
          + "paceReadState\"T\n\030GetSpaceReadStateReques"
          + "t\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"chat.googleapis"
          + ".com/SpaceReadState\"\222\001\n\033UpdateSpaceReadS"
          + "tateRequest\022=\n\020space_read_state\030\001 \001(\0132\036."
          + "google.chat.v1.SpaceReadStateB\003\340A\002\0224\n\013up"
          + "date_mask\030\002 \001(\0132\032.google.protobuf.FieldM"
          + "askB\003\340A\002B\236\001\n\022com.google.chat.v1B\023SpaceRe"
          + "adStateProtoP\001Z,cloud.google.com/go/chat"
          + "/apiv1/chatpb;chatpb\252\002\023Google.Apps.Chat."
          + "V1\312\002\023Google\\Apps\\Chat\\V1\352\002\026Google::Apps:"
          + ":Chat::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_chat_v1_SpaceReadState_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_chat_v1_SpaceReadState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_SpaceReadState_descriptor,
            new java.lang.String[] {
              "Name", "LastReadTime",
            });
    internal_static_google_chat_v1_GetSpaceReadStateRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_chat_v1_GetSpaceReadStateRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_GetSpaceReadStateRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_chat_v1_UpdateSpaceReadStateRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_chat_v1_UpdateSpaceReadStateRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_UpdateSpaceReadStateRequest_descriptor,
            new java.lang.String[] {
              "SpaceReadState", "UpdateMask",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
