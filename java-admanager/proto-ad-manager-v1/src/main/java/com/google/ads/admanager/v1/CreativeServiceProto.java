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
// source: google/ads/admanager/v1/creative_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.admanager.v1;

public final class CreativeServiceProto {
  private CreativeServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_Creative_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_Creative_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_GetCreativeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_GetCreativeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_ListCreativesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_ListCreativesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_ListCreativesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_ListCreativesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/ads/admanager/v1/creative_servi"
          + "ce.proto\022\027google.ads.admanager.v1\0324googl"
          + "e/ads/admanager/v1/ad_partner_declaratio"
          + "n.proto\032\034google/api/annotations.proto\032\027g"
          + "oogle/api/client.proto\032\037google/api/field"
          + "_behavior.proto\032\031google/api/resource.pro"
          + "to\032\037google/protobuf/timestamp.proto\"\270\003\n\010"
          + "Creative\022\021\n\004name\030\001 \001(\tB\003\340A\010\022\030\n\013creative_"
          + "id\030\007 \001(\003B\003\340A\003\022\031\n\014display_name\030\010 \001(\tB\003\340A\001"
          + "\022<\n\nadvertiser\030\002 \001(\tB(\340A\002\372A\"\n admanager."
          + "googleapis.com/Company\0224\n\013update_time\030\003 "
          + "\001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\030\n\013"
          + "preview_url\030\004 \001(\tB\003\340A\003\022\027\n\nsize_label\030\t \001"
          + "(\tB\003\340A\003\022R\n\026ad_partner_declaration\030\006 \001(\0132"
          + "-.google.ads.admanager.v1.AdPartnerDecla"
          + "rationB\003\340A\001:i\352Af\n!admanager.googleapis.c"
          + "om/Creative\022,networks/{network_code}/cre"
          + "atives/{creative}*\tcreatives2\010creative\"M"
          + "\n\022GetCreativeRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372"
          + "A#\n!admanager.googleapis.com/Creative\"\300\001"
          + "\n\024ListCreativesRequest\0228\n\006parent\030\001 \001(\tB("
          + "\340A\002\372A\"\n admanager.googleapis.com/Network"
          + "\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003"
          + " \001(\tB\003\340A\001\022\023\n\006filter\030\004 \001(\tB\003\340A\001\022\025\n\010order_"
          + "by\030\005 \001(\tB\003\340A\001\022\021\n\004skip\030\006 \001(\005B\003\340A\001\"z\n\025List"
          + "CreativesResponse\0224\n\tcreatives\030\001 \003(\0132!.g"
          + "oogle.ads.admanager.v1.Creative\022\027\n\017next_"
          + "page_token\030\002 \001(\t\022\022\n\ntotal_size\030\003 \001(\0052\345\002\n"
          + "\017CreativeService\022\217\001\n\013GetCreative\022+.googl"
          + "e.ads.admanager.v1.GetCreativeRequest\032!."
          + "google.ads.admanager.v1.Creative\"0\332A\004nam"
          + "e\202\323\344\223\002#\022!/v1/{name=networks/*/creatives/"
          + "*}\022\242\001\n\rListCreatives\022-.google.ads.admana"
          + "ger.v1.ListCreativesRequest\032..google.ads"
          + ".admanager.v1.ListCreativesResponse\"2\332A\006"
          + "parent\202\323\344\223\002#\022!/v1/{parent=networks/*}/cr"
          + "eatives\032\033\312A\030admanager.googleapis.comB\261\001\n"
          + "\033com.google.ads.admanager.v1B\024CreativeSe"
          + "rviceProtoP\001Z@google.golang.org/genproto"
          + "/googleapis/ads/admanager/v1;admanager\242\002"
          + "\003GAA\252\002\027Google.Ads.AdManager.V1\312\002\027Google\\"
          + "Ads\\AdManager\\V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.ads.admanager.v1.AdPartnerDeclarationProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_ads_admanager_v1_Creative_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_Creative_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_Creative_descriptor,
            new java.lang.String[] {
              "Name",
              "CreativeId",
              "DisplayName",
              "Advertiser",
              "UpdateTime",
              "PreviewUrl",
              "SizeLabel",
              "AdPartnerDeclaration",
            });
    internal_static_google_ads_admanager_v1_GetCreativeRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_admanager_v1_GetCreativeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_GetCreativeRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_ads_admanager_v1_ListCreativesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_admanager_v1_ListCreativesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_ListCreativesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy", "Skip",
            });
    internal_static_google_ads_admanager_v1_ListCreativesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_admanager_v1_ListCreativesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_ListCreativesResponse_descriptor,
            new java.lang.String[] {
              "Creatives", "NextPageToken", "TotalSize",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.ads.admanager.v1.AdPartnerDeclarationProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
