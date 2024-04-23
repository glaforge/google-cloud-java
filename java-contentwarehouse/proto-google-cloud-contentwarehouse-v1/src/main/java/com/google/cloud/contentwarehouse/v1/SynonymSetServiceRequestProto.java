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
// source: google/cloud/contentwarehouse/v1/synonymset_service_request.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.contentwarehouse.v1;

public final class SynonymSetServiceRequestProto {
  private SynonymSetServiceRequestProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_CreateSynonymSetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_CreateSynonymSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_GetSynonymSetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_GetSynonymSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_ListSynonymSetsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_ListSynonymSetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_ListSynonymSetsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_ListSynonymSetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_UpdateSynonymSetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_UpdateSynonymSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_contentwarehouse_v1_DeleteSynonymSetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_contentwarehouse_v1_DeleteSynonymSetRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/cloud/contentwarehouse/v1/synon"
          + "ymset_service_request.proto\022 google.clou"
          + "d.contentwarehouse.v1\032\037google/api/field_"
          + "behavior.proto\032\031google/api/resource.prot"
          + "o\0321google/cloud/contentwarehouse/v1/syno"
          + "nymset.proto\"\243\001\n\027CreateSynonymSetRequest"
          + "\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*\n(contentwarehou"
          + "se.googleapis.com/Location\022F\n\013synonym_se"
          + "t\030\002 \001(\0132,.google.cloud.contentwarehouse."
          + "v1.SynonymSetB\003\340A\002\"X\n\024GetSynonymSetReque"
          + "st\022@\n\004name\030\001 \001(\tB2\340A\002\372A,\n*contentwarehou"
          + "se.googleapis.com/SynonymSet\"\201\001\n\026ListSyn"
          + "onymSetsRequest\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*\n"
          + "(contentwarehouse.googleapis.com/Locatio"
          + "n\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t"
          + "\"v\n\027ListSynonymSetsResponse\022B\n\014synonym_s"
          + "ets\030\001 \003(\0132,.google.cloud.contentwarehous"
          + "e.v1.SynonymSet\022\027\n\017next_page_token\030\002 \001(\t"
          + "\"\243\001\n\027UpdateSynonymSetRequest\022@\n\004name\030\001 \001"
          + "(\tB2\340A\002\372A,\n*contentwarehouse.googleapis."
          + "com/SynonymSet\022F\n\013synonym_set\030\002 \001(\0132,.go"
          + "ogle.cloud.contentwarehouse.v1.SynonymSe"
          + "tB\003\340A\002\"[\n\027DeleteSynonymSetRequest\022@\n\004nam"
          + "e\030\001 \001(\tB2\340A\002\372A,\n*contentwarehouse.google"
          + "apis.com/SynonymSetB\205\002\n$com.google.cloud"
          + ".contentwarehouse.v1B\035SynonymSetServiceR"
          + "equestProtoP\001ZPcloud.google.com/go/conte"
          + "ntwarehouse/apiv1/contentwarehousepb;con"
          + "tentwarehousepb\252\002 Google.Cloud.ContentWa"
          + "rehouse.V1\312\002 Google\\Cloud\\ContentWarehou"
          + "se\\V1\352\002#Google::Cloud::ContentWarehouse:"
          + ":V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.contentwarehouse.v1.SynonymSetProto.getDescriptor(),
            });
    internal_static_google_cloud_contentwarehouse_v1_CreateSynonymSetRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_contentwarehouse_v1_CreateSynonymSetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_CreateSynonymSetRequest_descriptor,
            new java.lang.String[] {
              "Parent", "SynonymSet",
            });
    internal_static_google_cloud_contentwarehouse_v1_GetSynonymSetRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_contentwarehouse_v1_GetSynonymSetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_GetSynonymSetRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_contentwarehouse_v1_ListSynonymSetsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_contentwarehouse_v1_ListSynonymSetsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_ListSynonymSetsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_contentwarehouse_v1_ListSynonymSetsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_contentwarehouse_v1_ListSynonymSetsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_ListSynonymSetsResponse_descriptor,
            new java.lang.String[] {
              "SynonymSets", "NextPageToken",
            });
    internal_static_google_cloud_contentwarehouse_v1_UpdateSynonymSetRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_contentwarehouse_v1_UpdateSynonymSetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_UpdateSynonymSetRequest_descriptor,
            new java.lang.String[] {
              "Name", "SynonymSet",
            });
    internal_static_google_cloud_contentwarehouse_v1_DeleteSynonymSetRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_contentwarehouse_v1_DeleteSynonymSetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_contentwarehouse_v1_DeleteSynonymSetRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.contentwarehouse.v1.SynonymSetProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
